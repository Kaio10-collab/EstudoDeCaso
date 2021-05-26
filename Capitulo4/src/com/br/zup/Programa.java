package com.br.zup;

public class Programa {

    public static void main(String[] args) {
        // Estou criando a conta
        Conta minhaConta; // minhaConta é uma variável referência.
        minhaConta = new Conta(); // Estamos dizemos que a minhaConta é uma referência ao objeto Conta.

        Conta c1 = new Conta();
        c1.titular = "Kaio";
        c1.saldo = 227;

        Conta c2 = new Conta();
        c2.titular = "Tai";
        c2.saldo = 227;

        Conta minhaConta2 = new Conta();
        Cliente banco = new Cliente();
        minhaConta2.titular = banco.nome;
/**
 * LEMBRANDO QUE A VARIÁVEL NUNCA É UM OBJETO. "uma variável nunca carrega um objeto, e sim uma referência para ele"
 */
        Conta meuSonho;
        meuSonho = new Conta(); // new, depois de alocar a memória para esse objeto, devolve uma "flecha", isto é,
        // um valor de referência. Quando você atribui isso a uma variável, essa variável passa a se referir para esse mesmo objeto.
        meuSonho.saldo = 150000.0;

        // alterar os valores de minhaConta
        minhaConta.titular = "Kaio";
        minhaConta.saldo = 1000.0;

        System.out.println("Saldo atual " + minhaConta.saldo);

        // sacar valor do saldo
        minhaConta.sacaSaldo(200);

        // deposistando valor no saldo
        minhaConta.depositaSaldo(500);
        System.out.println(minhaConta.saldo);

        // transferindo saldo da conta1 kaio para a conta2 Tai.
        c1.transfere(c2,100);
    }
}