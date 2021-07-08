package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        double notaA;
        double pesoA = 2;
        double notaB;
        double pesoB = 3;
        double notaC;
        double pesoC = 5;
        double media;

        notaA = Double.parseDouble(entradaTeclado.nextLine());
        notaB = Double.parseDouble(entradaTeclado.nextLine());
        notaC = Double.parseDouble(entradaTeclado.nextLine());

        media = ((notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC)) / 10;

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("MEDIA = " + df.format(media).replace(",", "."));
    }
}
