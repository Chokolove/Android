package com.system.survey.proyfinalservicesurvey.Beans;

public class TipoUsuarioBean extends  Seguridad{

    public enum CAMPOS
    {
        IdTipoUsuario,
        NomTipoUsuario
    }

    private int _IdTipoUsuario;
    private String _NomTipoUsuario;

    public int get_IdTipoUsuario() {
        return _IdTipoUsuario;
    }

    public void set_IdTipoUsuario(int _IdTipoUsuario) {
        this._IdTipoUsuario = _IdTipoUsuario;
    }

    public String get_NomTipoUsuario() {
        return _NomTipoUsuario;
    }

    public void set_NomTipoUsuario(String _NomTipoUsuario) {
        this._NomTipoUsuario = _NomTipoUsuario;
    }

    public TipoUsuarioBean() { this.LimpiarPropiedades(); }

    public TipoUsuarioBean(int PIdTipoUsuario, String PNomTipoUsuario) {
        this.LimpiarPropiedades();
        this._IdTipoUsuario = PIdTipoUsuario;
        this._NomTipoUsuario = PNomTipoUsuario;
    }

    public void LimpiarPropiedades()
    {
        this._IdTipoUsuario=0;
        this._NomTipoUsuario="";
    }
}
