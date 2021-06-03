package com.br.zup;

public class Presidente extends Funcionario{
    @Override
    public double getBonificacao() {
        return this.salario*1.7+2000;
    }
}
