package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        double notaA;
        double pesoA = 3.5;
        double notaB;
        double pesoB = 7.5;
        double media;

        notaA = Double.parseDouble(entradaTeclado.nextLine());
        notaB = Double.parseDouble(entradaTeclado.nextLine());

        media = ((notaA * pesoA) + (notaB * pesoB)) / 11;

        DecimalFormat df = new DecimalFormat("0.00000");

        System.out.println("MEDIA = " + df.format(media).replace(",","."));
    }
}
