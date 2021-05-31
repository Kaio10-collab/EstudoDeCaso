package com.br.zup;

import java.time.LocalDate;

public class Conta {

    private String nomeTitular;
    private String agencia;
    private double saldo;
    private LocalDate DataDeAbertura;
    private int numero;

    public double calculaRendimento(){
        return this.saldo*0.1;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -=valor;
    }

    public LocalDate getDataDeAbertura() {
        return DataDeAbertura;
    }

    public void setDataDeAbertura(int dataDeAbertura) {
        DataDeAbertura = dataDeAbertura;
    }

    public String recuperaDadosParaImpressao(){}

    public Conta() {
    }
}