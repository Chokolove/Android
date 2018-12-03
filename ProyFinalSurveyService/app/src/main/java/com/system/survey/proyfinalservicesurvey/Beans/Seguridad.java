package com.system.survey.proyfinalservicesurvey.Beans;

public class Seguridad {

    private int CodigoError;
    private String DescripcionError;
    private String Accion;

    public Seguridad()
    {
        setCodigoError(0);
        setDescripcionError("");

    }

    public String getAccion() {
        return Accion;
    }
    public void setAccion(String pAccion) {
        Accion = pAccion;
    }
    public String getDescripcionError() {
        return DescripcionError;
    }

    public void setDescripcionError(String descripcionError) {
        DescripcionError = descripcionError;
    }

    public int getCodigoError() {
        return CodigoError;
    }

    public void setCodigoError(int codigoError) {
        CodigoError = codigoError;
    }
}
