package com.system.survey.proyfinalservicesurvey.Beans;

public class TipoEmpresaBean extends Seguridad {

    public enum CAMPOS
    {
        IdTipoEmpresa,
        NomTipoEmpresa
    }

    private int _IdTipoEmpresa;
    private String _NomTipoEmpresa;

    public int get_IdTipoEmpresa() {
        return _IdTipoEmpresa;
    }

    public void set_IdTipoEmpresa(int _IdTipoEmpresa) {
        this._IdTipoEmpresa = _IdTipoEmpresa;
    }

    public String get_NomTipoEmpresa() {
        return _NomTipoEmpresa;
    }

    public void set_NomTipoEmpresa(String _NomTipoEmpresa) {
        this._NomTipoEmpresa = _NomTipoEmpresa;
    }

    public TipoEmpresaBean()
    {
        this.LimpiarPropiedades();
    }

    public TipoEmpresaBean(int PIdTipoEmpresa, String PNomTipoEmpresa) {
        this.LimpiarPropiedades();
        this._IdTipoEmpresa = PIdTipoEmpresa;
        this._NomTipoEmpresa =PNomTipoEmpresa;
    }

    public void LimpiarPropiedades()
    {
        this._IdTipoEmpresa=0;
        this._NomTipoEmpresa="";
    }
}
