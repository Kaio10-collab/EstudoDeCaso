package com.br.zup;

public class Ceo extends Gerentes{

    @Override
    public double getBonificacao(){
        return this.salario * 0.20;
    }
}