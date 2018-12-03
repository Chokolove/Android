package com.system.survey.proyfinalservicesurvey.Beans;

public class EmpresaBean extends  Seguridad{

    public enum CAMPOS
    {
        IdEmpresa,
        NomEmpresa,
        TipoEmpresa,
        FchaCreacion,
        Estado
    }

    private int _IdEmpresa;
    private String _NomEmpresa;
    private TipoEmpresaBean _TipoEmpresa;
    private String _FchaCreacion;
    private TipoEstadoBean _Estado;

    public int get_IdEmpresa() {
        return _IdEmpresa;
    }

    public void set_IdEmpresa(int _IdEmpresa) {
        this._IdEmpresa = _IdEmpresa;
    }

    public String get_NomEmpresa() {
        return _NomEmpresa;
    }

    public void set_NomEmpresa(String _NomEmpresa) {
        this._NomEmpresa = _NomEmpresa;
    }

    public TipoEmpresaBean get_TipoEmpresa() {
        return _TipoEmpresa;
    }

    public void set_TipoEmpresa(TipoEmpresaBean _TipoEmpresa) {
        this._TipoEmpresa = _TipoEmpresa;
    }

    public String get_FchaCreacion() {
        return _FchaCreacion;
    }

    public void set_FchaCreacion(String _FchaCreacion) {
        this._FchaCreacion = _FchaCreacion;
    }

    public TipoEstadoBean get_Estado() {
        return _Estado;
    }

    public void set_Estado(TipoEstadoBean _Estado) {
        this._Estado = _Estado;
    }

    public EmpresaBean() { this.LimpiarPropiedades(); }

    public EmpresaBean(int PIdEmpresa, String PNomEmpresa, TipoEmpresaBean PTipoEmpresa, String PFchaCreacion, TipoEstadoBean PEstado) {
        this.LimpiarPropiedades();
        this._IdEmpresa = PIdEmpresa;
        this._NomEmpresa = PNomEmpresa;
        this._TipoEmpresa = PTipoEmpresa;
        this._FchaCreacion = PFchaCreacion;
        this._Estado = PEstado;
    }

    public void LimpiarPropiedades()
    {
        this._IdEmpresa=0;
        this._NomEmpresa="";
        this._TipoEmpresa= new TipoEmpresaBean();
        this._FchaCreacion= "";
        this._Estado= new TipoEstadoBean();

    }
}
