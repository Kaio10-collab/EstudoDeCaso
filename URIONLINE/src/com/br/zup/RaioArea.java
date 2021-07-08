package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RaioArea {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        double n = 3.14159;
        double raio;
        double area;
        String valorFormatado;

        raio = Double.parseDouble(entradaTeclado.nextLine());
        DecimalFormat raioFormat = new DecimalFormat("0.0000");
        raioFormat.format(raio).replace(",",".");

        area = n * raio*raio;
        DecimalFormat areaFormat = new DecimalFormat("0.0000");
        areaFormat.format(area).replace(",", ".");

        DecimalFormat formatar = new DecimalFormat("0.0000");
        valorFormatado = formatar.format(area).replace(",", ".");

        System.out.println("A=" + valorFormatado);

    }
}
