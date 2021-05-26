package com.br.zup;

public class Programa {

    public static void main(String[] args) {
        // Estou criando a conta
        Conta minhaConta; // minhaConta é uma variável referência.
        minhaConta = new Conta(); // Estamos dizemos que a minhaConta é uma referência ao objeto Conta.
/**
 * LEMBRANDO QUE A VARIÁVEL NUNCA É UM OBJETO.
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
    }
}