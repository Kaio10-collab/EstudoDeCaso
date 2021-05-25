package com.br.zup;

public class Programa {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.titular = "Kaio";
        minhaConta.saldo = 1000.0;

        System.out.println("Saldo atual" + minhaConta.saldo);
    }
}