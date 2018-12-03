package com.system.survey.proyfinalservicesurvey.Beans;

public class TipoEstadoBean extends Seguridad {

    public enum CAMPO
    {
        IdTipoEstado,
        NomTipoEstado
    }

    private int _IdTipoEstado;
    private String _NomTipoEstado;



    public int get_IdTipoEstado() {
        return _IdTipoEstado;
    }

    public void set_IdTipoEstado(int _IdTipoEstado) {
        this._IdTipoEstado = _IdTipoEstado;
    }

    public String get_NomTipoEstado() {
        return _NomTipoEstado;
    }

    public void set_NomTipoEstado(String _NomTipoEstado) {
        this._NomTipoEstado = _NomTipoEstado;
    }

    public TipoEstadoBean()
    {
        this.LimpiarPropiedades();
    }

    public TipoEstadoBean(int PIdTipoEstado, String PNomTipoEstado )
    {
        this.LimpiarPropiedades();
        this._NomTipoEstado = PNomTipoEstado;
        this._NomTipoEstado = PNomTipoEstado;
    }

    public void LimpiarPropiedades()
    {
        this._IdTipoEstado=0;
        this._NomTipoEstado="";
    }
}
