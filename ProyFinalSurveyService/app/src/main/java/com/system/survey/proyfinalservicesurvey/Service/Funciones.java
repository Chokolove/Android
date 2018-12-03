package com.system.survey.proyfinalservicesurvey.Service;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Created by USER on 15/11/2015.
 */
//extends Activity
public class Funciones {
private static String DEBUG_TAG="Funciones";

    public static boolean ValidarServicioRed(final Context pContexto)
    {
        Funciones ofunciones=new Funciones();
        return ofunciones.ValidarConexionRed(pContexto);
    }

    private boolean ValidarConexionRed(final Context pContexto)
    {
        Boolean BolResul=false;
        ConnectivityManager connMgr = (ConnectivityManager) pContexto.getSystemService(pContexto.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            BolResul=true;
        } else {
            BolResul=false;
        }
        return BolResul;
    }

    public static String DescargarPaginaPOST(String pUrl, String purlParameters) throws IOException {

        String urlParameters  = purlParameters;
        byte[] postData       = urlParameters.getBytes( StandardCharsets.UTF_8 );
        int    postDataLength = postData.length;
        URL    url            = new URL( pUrl );
        HttpURLConnection conn= (HttpURLConnection) url.openConnection();
        conn.setDoOutput( true );
        conn.setInstanceFollowRedirects( false );
        conn.setRequestMethod( "POST" );

        conn.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty( "charset", "utf-8");
        conn.setRequestProperty( "Content-Length", Integer.toString( postDataLength ));
        InputStream is = null;
        // Only display the first 500 characters of the retrieved
        // web page content.
        int len = 500000;

        try {
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            //conn.setRequestMethod("GET");
            conn.setDoInput(true);

            conn.setUseCaches( false );
            try( DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
                wr.write( postData );
            }
            // Starts the query
            conn.connect();
            int response = conn.getResponseCode();
            Log.d(DEBUG_TAG, "La respuesta es: " + response);
            is = conn.getInputStream();

            // Convert the InputStream into a string
            String contentAsString = LeerContenido(is, len);
            return contentAsString;

            // Makes sure that the InputStream is closed after the app is
            // finished using it.
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }


   // public static String DescargarPagina(String pUrl, ArrayList<Parametros_BE> Parametros) throws IOException {
   public static String DescargarPagina(String pUrl) throws IOException {
       InputStream is = null;
       HttpURLConnection conn=null;
       // Only display the first 500 characters of the retrieved
       // web page content.
       int len = 1024;

       try {
           URL url = new URL(pUrl);
           conn = (HttpURLConnection) url.openConnection();
           conn.setReadTimeout(10000 /* milliseconds */);
           conn.setConnectTimeout(15000 /* milliseconds */);
           conn.setRequestMethod("GET");
           conn.setDoInput(true);
           // Starts the query
           conn.connect();
           int response = conn.getResponseCode();
           Log.d(DEBUG_TAG, "La respuesta es: " + response);
           is = conn.getInputStream();

           // Convert the InputStream into a string
           String contentAsString = LeerContenido(is, len);
           return contentAsString;

           // Makes sure that the InputStream is closed after the app is
           // finished using it.
       } finally {
           if (is != null) {
               is.close();
           }
           if (conn != null) {
               conn.disconnect();
           }

       }
   }

    public static String LeerContenido(InputStream stream, int len) throws IOException, UnsupportedEncodingException {

       /* Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
        */
        InputStream in = stream;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder result = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            result.append(line);
        }
        return result.toString();
    }


    public static void showAlertDialog(final Context context,final String pTitulo, final String pMessage) {
        new AlertDialog.Builder(context)
                .setMessage(pMessage)
                .setTitle(pTitulo)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                //.setIcon(android.R.drawable.ic_notification_overlay)
                .show();
    }

}
