package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        double a = Double.parseDouble(entradaTeclado.next()); // next permite que possa lê na mesma linda do scanner.
        double b = Double.parseDouble(entradaTeclado.next());
        double c = Double.parseDouble(entradaTeclado.next());
        double pi = 3.14159;
        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;

        DecimalFormat df = new DecimalFormat("0.000");

        areaTriangulo = (a*c)/2;
        areaCirculo = (c*c)*pi;
        areaTrapezio = ((a + b) * c)/2;
        areaQuadrado = b*b;
        areaRetangulo = a*b;

        System.out.println("TRIANGULO: " + df.format(areaTriangulo).replace(",","."));
        System.out.println("CIRCULO: " + df.format(areaCirculo).replace(",","."));
        System.out.println("TRAPEZIO: " + df.format(areaTrapezio).replace(",","."));
        System.out.println("QUADRADO: " + df.format(areaQuadrado).replace(",","."));
        System.out.println("RETANGULO: " + df.format(areaRetangulo).replace(",","."));
    }
}
