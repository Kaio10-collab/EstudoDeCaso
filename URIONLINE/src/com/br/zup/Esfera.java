package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        double raio = Double.parseDouble(entradaTeclado.nextLine());
        double pi = 3.14159;
        double volume;

        DecimalFormat df = new DecimalFormat("0.000");

        volume = (4.0 * pi * (raio*raio*raio)) / 3.0;

        System.out.println("VOLUME = " + df.format(volume).replace(",","."));

    }
}
