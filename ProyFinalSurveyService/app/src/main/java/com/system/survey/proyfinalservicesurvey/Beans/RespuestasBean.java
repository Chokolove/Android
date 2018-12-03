package com.system.survey.proyfinalservicesurvey.Beans;

public class RespuestasBean extends  Seguridad {

    public enum CAMPOS
    {
        idRespuesta,
        pregunta,
        descRespuesta,
        contRespuesta
    }

    private int _idRespuesta;
    private PreguntasBean _pregunta;
    private String _descRespuesta;
    private int _contRespuesta;

    public int get_idRespuesta() {
        return _idRespuesta;
    }

    public void set_idRespuesta(int _idRespuesta) {
        this._idRespuesta = _idRespuesta;
    }

    public PreguntasBean get_pregunta() {
        return _pregunta;
    }

    public void set_pregunta(PreguntasBean _pregunta) {
        this._pregunta = _pregunta;
    }

    public String get_descRespuesta() {
        return _descRespuesta;
    }

    public void set_descRespuesta(String _descRespuesta) {
        this._descRespuesta = _descRespuesta;
    }

    public int get_contRespuesta() {
        return _contRespuesta;
    }

    public void set_contRespuesta(int _contRespuesta) {
        this._contRespuesta = _contRespuesta;
    }

    public RespuestasBean() { this.LimpiarPropiedades(); }

    public RespuestasBean(int PidRespuesta, PreguntasBean Ppregunta, String PdescRespuesta, int PcontRespuesta) {
        this.LimpiarPropiedades();
        this._idRespuesta = PidRespuesta;
        this._pregunta = Ppregunta;
        this._descRespuesta = PdescRespuesta;
        this._contRespuesta = PcontRespuesta;
    }

    public void LimpiarPropiedades()
    {
        this._idRespuesta=0;
        this._pregunta= new PreguntasBean();
        this._descRespuesta="";
        this._contRespuesta=0;

    }
}
