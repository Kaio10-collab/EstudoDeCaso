package com.br.zup;

/**
 * O objetivo aqui é criar um sistema para gerenciar as contas de um Banco. Os exercícios desse capítulo são
 * extremamente importantes.
 *
 * Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes. Desenhe no
 * papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome do titular (String), o número (int), a
 * agência (String), o saldo (double) e uma data de abertura (String).
 */
public class Conta {
    //definindo atributos
    String nomeTitular;
    String agencia;
    String dataDeAbertura;
    double saldo;
    int numero;

    /**
     * Além disso, ela deve fazer as seguintes ações:
     *  * saca, para retirar um valor do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver
     *  * o rendimento mensal dessa conta.
     */

    void sacarSaldo(double quantidade){
        double saldoNovo = this.saldo - quantidade;
        this.saldo = saldoNovo;
    }

    void depositarSaldo(double quantidade){
        this.saldo = this.saldo + quantidade;
    }

    public double rendimentoMensal(){
        double valorMensal = saldo*0.1;
        return valorMensal;
    }

    public String dadosParaImpressao(){
        String dadosDoTitular = "Titular: " + this.nomeTitular;
        dadosDoTitular +=" /nNúmero: " + this.numero;
        dadosDoTitular +=" /nAgência: " + this.agencia;
        dadosDoTitular +=" /nSaldo: R$ " + this.saldo;
        dadosDoTitular +=" /nData de abertura: " + this.dataDeAbertura;
        return dadosDoTitular;
    }

    boolean saca(double valor){
        if (this.saldo<valor){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    boolean titularUmTransfereParaTitularDois(Conta transferencia, double valor){
        boolean retirada = this.saca(valor);
        if (retirada == false){
            return false;
        }
        else {
            transferencia.depositarSaldo(valor);
            return true;
        }
    }
}