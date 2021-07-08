package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) throws IOException {

        Scanner entradaTerminal = new Scanner(System.in);

        int carroX = entradaTerminal.nextInt()*2;

        System.out.println(carroX + " minutos");
    }
}
