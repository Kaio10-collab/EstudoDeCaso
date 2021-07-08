package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) throws IOException {

        Scanner entradaValor = new Scanner(System.in);

        int valorX = Integer.parseInt(entradaValor.nextLine());
        double valorY = Double.parseDouble(entradaValor.nextLine());
        double consumo;

        DecimalFormat df = new DecimalFormat("0.000");

        consumo = valorX / valorY;

        System.out.println(df.format(consumo).replace(",",".")+ " km/l");

    }
}
