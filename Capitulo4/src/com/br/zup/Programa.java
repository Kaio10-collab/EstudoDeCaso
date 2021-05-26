package com.br.zup;

public class Programa {

    public static void main(String[] args) {
        // Estou criando a conta
        Conta minhaConta;
        minhaConta = new Conta();

        // alterar os valores de minhaConta
        minhaConta.titular = "Kaio";
        minhaConta.saldo = 1000.0;

        System.out.println("Saldo atual " + minhaConta.saldo);

        // sacar valor do saldo
        minhaConta.sacaSaldo(200);

        // deposistando valor no sald
        minhaConta.depositaSaldo(500);
        System.out.println(minhaConta.saldo);
    }

}