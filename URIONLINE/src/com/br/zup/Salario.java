package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        int horaTrabalhadas;
        int recebePorHora;
        double numero;
        double salario;

        horaTrabalhadas = entradaTeclado.nextInt();
        recebePorHora = entradaTeclado.nextInt();
        numero = entradaTeclado.nextDouble();

        salario = (horaTrabalhadas * recebePorHora * numero / horaTrabalhadas);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("NUMBER = " + horaTrabalhadas);
        System.out.println("SALARY = U$ " + decimalFormat.format(salario).replace(",","."));
    }
}