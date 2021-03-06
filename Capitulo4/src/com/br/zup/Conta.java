package com.br.zup;

public class Conta {

    // definição de atributos
    int numero; // se definirmos int numero = 200, ele será um atributo "populado" ou seja será um valor padrão.
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

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if (retirou == false){
            // não deu pra sacar!
            return false;
        }
        else {
            destino.depositaSaldo(valor);
            return true;
        }
    }
}