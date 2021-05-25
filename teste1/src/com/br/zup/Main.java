package com.br.zup;

/**
 * Capitulo 3 - 25/05
 */
public class Main {

    public static void main(String[] args) {
	// Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do
    // primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos 15000 reais, em
    // Fevereiro, 23000 reais e em Março, 17000 reais, faça um programa que calcule e imprima o gasto total no
    // trimestre e a média mensal de gastos.
        Double janeiro = 15.000;
        Double fevereiro = 23.000;
        Double marco = 17.000;

        Double somaTrimestre = janeiro + fevereiro + marco;
        System.out.println(somaTrimestre);

        // media mensal de gastos
        Double mediaMensal;
        mediaMensal =  somaTrimestre / 3;
        System.out.println(mediaMensal);
    }
}