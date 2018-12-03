package com.system.survey.proyfinalservicesurvey.Beans;

public class EncuestaBean extends Seguridad{

    public enum CAMPOS
    {
        IdEncuesta,
        Usuario,
        NomEncuesta,
        ContRespuestas,
        FchaCreacion,
        Estado
    }

    private int _IdEncuesta;
    private UsuarioBean _Usuario;
    private String _NomEncuesta;
    private int _ContRespuestas;
    private String _FchaCreacion;
    private TipoEstadoBean _TipoEstado;

    public int get_IdEncuesta() {
        return _IdEncuesta;
    }

    public void set_IdEncuesta(int _IdEncuesta) {
        this._IdEncuesta = _IdEncuesta;
    }

    public UsuarioBean get_Usuario() {
        return _Usuario;
    }

    public void set_Usuario(UsuarioBean _Usuario) {
        this._Usuario = _Usuario;
    }

    public String get_NomEncuesta() {
        return _NomEncuesta;
    }

    public void set_NomEncuesta(String _NomEncuesta) {
        this._NomEncuesta = _NomEncuesta;
    }

    public int get_ContRespuestas() {
        return _ContRespuestas;
    }

    public void set_ContRespuestas(int _ContRespuestas) {
        this._ContRespuestas = _ContRespuestas;
    }

    public String get_FchaCreacion() {
        return _FchaCreacion;
    }

    public void set_FchaCreacion(String _FchaCreacion) {
        this._FchaCreacion = _FchaCreacion;
    }

    public TipoEstadoBean get_TipoEstado() {
        return _TipoEstado;
    }

    public void set_TipoEstado(TipoEstadoBean _TipoEstado) {
        this._TipoEstado = _TipoEstado;
    }

    public EncuestaBean(int PIdEncuesta, UsuarioBean PUsuario, String PNomEncuesta, int PContRespuestas, String PFchaCreacion, TipoEstadoBean PTipoEstado) {
        this.LimpiarPropiedades();
        this._IdEncuesta = PIdEncuesta;
        this._Usuario = PUsuario;
        this._NomEncuesta = PNomEncuesta;
        this._ContRespuestas = PContRespuestas;
        this._FchaCreacion = PFchaCreacion;
        this._TipoEstado = PTipoEstado;
    }

    public EncuestaBean() { this.LimpiarPropiedades(); }

    public void LimpiarPropiedades()
    {
        this._IdEncuesta=0;
        this._Usuario= new UsuarioBean();
        this._NomEncuesta="";
        this._ContRespuestas=0;
        this._FchaCreacion="";
        this._TipoEstado= new TipoEstadoBean();
    }


}
