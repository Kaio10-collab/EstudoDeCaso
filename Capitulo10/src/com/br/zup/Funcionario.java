package com.br.zup;

public abstract class Funcionario {

// se colocamos abstract antes do class estamos impedindo que ela possa ser instaciada.
    // Ou seja, Funcionario f = new Funcionario(); // não irá compilar!!!

    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double getBonificacao(); // métod abstrato. inverte o { pelo ;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}