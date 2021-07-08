package com.br.zup;

public class Lampada {

    public static void main (String[]args){

    }
    private int watts;
    private String halogenio;
    private String led;
    private String filamento;
    private String incandescente;
    private String fluorescente;
    private String wireless;
    private EstadoEnum estado;

    public Lampada() {
    }

    public Lampada(int watts, String halogenio, String led, String filamento, String incandescente, String fluorescente, String wireless, EstadoEnum estado) {
        this.watts = watts;
        this.halogenio = halogenio;
        this.led = led;
        this.filamento = filamento;
        this.incandescente = incandescente;
        this.fluorescente = fluorescente;
        this.wireless = wireless;
        this.estado = estado;
    }
// Lampada lampada = new Lampada(passa os parametros) - em caso de constructor cheio, se for vazio, utilizar set.

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public String getHalogenio() {
        return halogenio;
    }

    public void setHalogenio(String halogenio) {
        this.halogenio = halogenio;
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public String getFilamento() {
        return filamento;
    }

    public void setFilamento(String filamento) {
        this.filamento = filamento;
    }

    public String getIncandescente() {
        return incandescente;
    }

    public void setIncandescente(String incandescente) {
        this.incandescente = incandescente;
    }

    public String getFluorescente() {
        return fluorescente;
    }

    public void setFluorescente(String fluorescente) {
        this.fluorescente = fluorescente;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public void lampadaAcessa(){
        estado = EstadoEnum.LIGADO;
    }

    public void lampadaDesligada() {
        estado = EstadoEnum.DESLIGADO;
    }

    public void lampadaMeioEstado() {
        estado = EstadoEnum.MEIO_ESTADO;
    }

    public boolean eEconomica(){
        if ( watts > 40 ){
            return false;
        }
        return true;
    }
}