package com.br.zup;

public class TestarConta {

    public static void main(String[] args) {
        Conta c = new Conta();
        c.setNumero(123);
        c.deposita(50);
        c.setDataDeAbertura(2021-05-03);

        System.out.println(c.recuperaDadosParaImpressao());
    }

}