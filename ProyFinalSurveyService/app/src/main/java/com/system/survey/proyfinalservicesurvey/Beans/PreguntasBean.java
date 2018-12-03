package com.system.survey.proyfinalservicesurvey.Beans;

public class PreguntasBean extends  Seguridad {

    public enum CAMPOS
    {
        idPregunta,
        encuesta,
        descPregunta,
        tipoPregunta
    }

    private int _idPregunta;
    private EncuestaBean _encuesta;
    private String _descPregunta;
    private TipoPreguntaBean _tipoPregunta;

    public int get_idPregunta() {
        return _idPregunta;
    }

    public void set_idPregunta(int _idPregunta) {
        this._idPregunta = _idPregunta;
    }

    public EncuestaBean get_encuesta() {
        return _encuesta;
    }

    public void set_encuesta(EncuestaBean _encuesta) {
        this._encuesta = _encuesta;
    }

    public String get_descPregunta() {
        return _descPregunta;
    }

    public void set_descPregunta(String _descPregunta) {
        this._descPregunta = _descPregunta;
    }

    public TipoPreguntaBean get_tipoPregunta() {
        return _tipoPregunta;
    }

    public void set_tipoPregunta(TipoPreguntaBean _tipoPregunta) {
        this._tipoPregunta = _tipoPregunta;
    }

    public PreguntasBean() { this.LimpiarPropiedades(); }

    public PreguntasBean(int PidPregunta, EncuestaBean Pencuesta, String PdescPregunta, TipoPreguntaBean PtipoPregunta) {
        this.LimpiarPropiedades();
        this._idPregunta = PidPregunta;
        this._encuesta = Pencuesta;
        this._descPregunta = PdescPregunta;
        this._tipoPregunta = PtipoPregunta;
    }

    public void LimpiarPropiedades()
    {
        this._idPregunta=0;
        this._encuesta= new EncuestaBean();
        this._descPregunta="";
        this._tipoPregunta= new TipoPreguntaBean();

    }
}
