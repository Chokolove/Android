package com.system.survey.proyfinalservicesurvey.Beans;

public class TipoPreguntaBean extends  Seguridad{

    public enum CAMPOS
    {
        idTipoPregunta,
        nomTipoPregunta
    }

    private int    _idTipoPregunta;
    private String _nomTipoPregunta;

    public int get_idTipoPregunta() {
        return _idTipoPregunta;
    }

    public void set_idTipoPregunta(int _idTipoPregunta) {
        this._idTipoPregunta = _idTipoPregunta;
    }

    public String get_nomTipoPregunta() {
        return _nomTipoPregunta;
    }

    public void set_nomTipoPregunta(String _nomTipoPregunta) {
        this._nomTipoPregunta = _nomTipoPregunta;
    }

    public TipoPreguntaBean() { this.LimpiarPropiedades(); }

    public TipoPreguntaBean(int PidTipoPregunta, String PnomTipoPregunta) {
        this.LimpiarPropiedades();
        this._idTipoPregunta = PidTipoPregunta;
        this._nomTipoPregunta = PnomTipoPregunta;
    }

    public void LimpiarPropiedades()
    {
        this._idTipoPregunta=0;
        this._nomTipoPregunta="";
    }
}
