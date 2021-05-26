package com.br.zup;

public class Conta {

    // definição de atributos
    int numero;
    String titular;
    double saldo;
    double salario;

    //variável comum(também chamada de temporária), pois ao final da execução deste metódo, ela deixa de existir.
    void sacaSaldo(double quantidade){
        double novoSaldo = this.saldo - quantidade; // this mostra que é um atributo e não a variável.
        this.saldo = novoSaldo;
    }

    void depositaSaldo(double quantidade) {
        this.saldo += quantidade;
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
}