package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) throws IOException {

        Scanner entradaTerminal = new Scanner(System.in);

        int valorInteiro = Integer.parseInt(entradaTerminal.nextLine());

        int ano = valorInteiro / 365;
        valorInteiro = valorInteiro % 365;

        int mes = valorInteiro / 30;
        valorInteiro = valorInteiro % 30;

        int dia = valorInteiro /1;
        valorInteiro = valorInteiro % 1;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

    }
}