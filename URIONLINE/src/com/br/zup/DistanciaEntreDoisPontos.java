package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) throws IOException {

        Scanner entradaTerminal = new Scanner(System.in);

        double x1 = Double.parseDouble(entradaTerminal.next());
        double y1 = Double.parseDouble(entradaTerminal.nextLine());
        double x2 = Double.parseDouble(entradaTerminal.next());
        double y2 = Double.parseDouble(entradaTerminal.nextLine());
        double distancia;

        DecimalFormat decimalFormat = new DecimalFormat("0.0000");

        distancia =Math.sqrt(((x2-x1)*(x2-x1)) + (((y2-y1)*(y2-y1))));

        System.out.println(decimalFormat.format(distancia).replace(",","."));
    }
}