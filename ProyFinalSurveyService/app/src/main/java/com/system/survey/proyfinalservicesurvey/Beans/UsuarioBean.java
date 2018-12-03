package com.system.survey.proyfinalservicesurvey.Beans;

public class UsuarioBean extends  Seguridad {

    public enum CAMPOS
    {
        IdUsuario,
        Login,
        Pass,
        NomUsu,
        Empresa,
        FchaCreacion,
        TipoUsuario,
        Estado
    }

    private int _IdUsuario;
    private String _Login;
    private String _Pass;
    private String _NomUsu;
    private EmpresaBean _Empresa;
    private String _FchaCreacion;
    private TipoUsuarioBean _TipoUsuario;
    private TipoEstadoBean _Estado;

    public int get_IdUsuario() {
        return _IdUsuario;
    }

    public void set_IdUsuario(int _IdUsuario) {
        this._IdUsuario = _IdUsuario;
    }

    public String get_Login() {
        return _Login;
    }

    public void set_Login(String _Login) {
        this._Login = _Login;
    }

    public String get_Pass() {
        return _Pass;
    }

    public void set_Pass(String _Pass) {
        this._Pass = _Pass;
    }

    public String get_NomUsu() {
        return _NomUsu;
    }

    public void set_NomUsu(String _NomUsu) {
        this._NomUsu = _NomUsu;
    }

    public EmpresaBean get_Empresa() {
        return _Empresa;
    }

    public void set_Empresa(EmpresaBean _Empresa) {
        this._Empresa = _Empresa;
    }

    public String get_FchaCreacion() {
        return _FchaCreacion;
    }

    public void set_FchaCreacion(String _FchaCreacion) {
        this._FchaCreacion = _FchaCreacion;
    }

    public TipoUsuarioBean get_TipoUsuario() {
        return _TipoUsuario;
    }

    public void set_TipoUsuario(TipoUsuarioBean _TipoUsuario) {
        this._TipoUsuario = _TipoUsuario;
    }

    public TipoEstadoBean get_Estado() {
        return _Estado;
    }

    public void set_Estado(TipoEstadoBean _Estado) {
        this._Estado = _Estado;
    }

    public UsuarioBean(){ this.LimpiarPropiedades(); }

    public UsuarioBean(int PIdUsuario, String PLogin, String PPass, String PNomUsu, EmpresaBean PEmpresa, String PFchaCreacion, TipoUsuarioBean PTipoUsuario, TipoEstadoBean PEstado) {
        this.LimpiarPropiedades();
        this._IdUsuario = PIdUsuario;
        this._Login = PLogin;
        this._Pass = PPass;
        this._NomUsu = PNomUsu;
        this._Empresa = PEmpresa;
        this._FchaCreacion = PFchaCreacion;
        this._TipoUsuario = PTipoUsuario;
        this._Estado = PEstado;
    }

    public void LimpiarPropiedades()
    {
        this._IdUsuario=0;
        this._Login="";
        this._Pass="";
        this._NomUsu="";
        this._Empresa= new EmpresaBean();
        this._FchaCreacion="";
        this._TipoUsuario= new TipoUsuarioBean();
        this._Estado= new TipoEstadoBean();
    }

}
