package com.br.zup;

public class Conta {

    //definição de atributos.
    private String titular; // private faz com ninguém consiga modificar, nem mesmo ler, o atributo em questão.
    private double saldo; // private é um tipo de modificador de acesso, igual public, default e protected.
    private double limite; // o modificador da visibilidade dá acesso às classes, atributos e métodos.

    // Por conta do private que não pode ser modificado ou lido, o ideal é construimos dois métodos,
    // um que retorna o valor e outro que muda o valor. No caso criando os getter e setters.

    public String getTitular() {
        return titular;
    } // get - obter

    public void setTitular(String titular) {
        this.titular = titular;
    } // set - definir

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Constructor vazio(PADRÃO).
    public Conta() {} // quando utilizamos a palavra NEW, estamos construindo um objeto.Sempre quando o new é chamado,
    // ele executa o constructor da classe. O constructor é um bloco declarado com o mesmo nome da classe.

    Conta c = new Conta();// NÃO É UM MÉTODO.

    // Constructor com argumento "titular" recebido.
    public Conta(String titular) {
        this.titular = titular;
    }

    // Quando criamos uma classe com os atributos privados e seus getters e setters e um construtor vazio, estamos criando
    // um Java Bean.

    //Métodos e atributos estáticos só podem acessar outros métodos e atributos estáticos da mesma classe, o que faz
    // todo sentido já que dentro de um método estático não temos acesso à referência this, pois um método estático é
    //  chamado através da classe, e não de um objeto.
}