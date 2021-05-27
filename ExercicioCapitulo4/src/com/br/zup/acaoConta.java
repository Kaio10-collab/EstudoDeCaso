package com.br.zup;

public class acaoConta {

    public static void main(String[] args) {
        Conta titular1 = new Conta();
        titular1.nomeTitular = "Kaio";
        titular1.numero = 345;
        titular1.agencia = "38987-8";
        titular1.saldo = 100.0;
        titular1.dataDeAbertura = "27/05/2021";

        Conta titular2 = new Conta();
        titular2.nomeTitular = "Tai";
        titular2.numero = 423;
        titular2.agencia = "45623-6";
        titular2.saldo = 200.0;
        titular2.dataDeAbertura = "25/05/2021";

        titular1.titularUmTransfereParaTitularDois(titular2, 50);

        titular1.depositarSaldo(300.0);
        System.out.println(titular1.dadosParaImpressao());
        System.out.println("Saldo atual: " + titular1.saldo);
        System.out.println("Rendimento mensal: " + titular1.rendimentoMensal());

        titular2.depositarSaldo(200.0);
        System.out.println(titular2.dadosParaImpressao());
        System.out.println("Saldo atual: " + titular2.saldo);
        System.out.println("Rendimento mensal: " + titular2.rendimentoMensal());
    }
}
