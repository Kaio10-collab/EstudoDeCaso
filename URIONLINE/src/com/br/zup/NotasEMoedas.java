package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) throws IOException {

        Scanner entradaTerminal = new Scanner(System.in);

        double valorCedula = Double.parseDouble(entradaTerminal.nextLine());

        System.out.println("NOTAS: ");

        int notas100 = (int) (valorCedula / 100);
        valorCedula = valorCedula % 100;

        int notas50 = (int) (valorCedula / 50);
        valorCedula = valorCedula % 50;

        int notas20 = (int) (valorCedula / 20);
        valorCedula = valorCedula % 20;

        int notas10 = (int) (valorCedula / 10);
        valorCedula = valorCedula % 10;

        int notas5 = (int) (valorCedula / 5);
        valorCedula = valorCedula % 5;

        int notas2 = (int) (valorCedula / 2);
        valorCedula = valorCedula % 2;

        int moeda1 = (int) (valorCedula / 1.00);
        valorCedula = valorCedula % 1;

        int moeda050 = (int) (valorCedula / 0.50);
        valorCedula = valorCedula % 0.50;

        int moeda025 = (int) (valorCedula / 0.25);
        valorCedula = valorCedula % 0.25;

        int moeda010 = (int) (valorCedula / 0.10);
        valorCedula = valorCedula % 0.10;

        int moeda005 = (int) (valorCedula / 0.05);
        valorCedula = valorCedula % 0.05;

        int moeda001 = (int) (valorCedula / 0.01);
        valorCedula = valorCedula % 0.01;

        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS: ");
        System.out.println(moeda1+ " moeda(s) de R$ 1.00");
        System.out.println(moeda050 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");

    }
}
