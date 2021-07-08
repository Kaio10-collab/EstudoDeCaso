package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) throws IOException {

        Scanner entradaTerminal = new Scanner(System.in);

        int valorCedula = entradaTerminal.nextInt();
        System.out.println(valorCedula);

        int notas100 = valorCedula / 100;
        valorCedula = valorCedula % 100;

        int notas50 = valorCedula / 50;
        valorCedula = valorCedula % 50;

        int notas20 = valorCedula / 20;
        valorCedula = valorCedula % 20;

        int notas10 = valorCedula / 10;
        valorCedula = valorCedula % 10;

        int notas5 = valorCedula / 5;
        valorCedula = valorCedula % 5;

        int notas2 = valorCedula / 2;
        valorCedula = valorCedula % 2;

        int notas1 = valorCedula / 1;
        valorCedula = valorCedula % 1;


        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
}
//  if (valorCedula > 0) {
//   notas100 = valorCedula / 100;
//valorCedula = valorCedula % 100;

//  notas50 = valorCedula / 50;
//   valorCedula = valorCedula % 50;

//   notas20 = valorCedula/20;
//  valorCedula = valorCedula % 20;

//  notas10 = valorCedula / 10;
//  valorCedula = valorCedula % 10;

// notas5 = valorCedula / 5;
//   valorCedula = valorCedula % 5;

// notas2 = valorCedula / 2;
// valorCedula = valorCedula % 2;

//notas1 = valorCedula / 1;
// valorCedula = valorCedula % 1;

        //}
//if (notas100 > 0) { }
//if (notas50 > 0) { }
// if (notas20 > 0) { }
// if (notas10 > 0) { }
// if (notas5 > 0) { }
// if (notas2 > 0){ }
// if (notas1 > 0) { }
//}