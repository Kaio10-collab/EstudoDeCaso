package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        int notaA;
        int notaB;
        int notaC;
        int notaD;
        int diferenca;

        notaA = entradaTeclado.nextInt();
        notaB = entradaTeclado.nextInt();
        notaC = entradaTeclado.nextInt();
        notaD = entradaTeclado.nextInt();

        diferenca = (notaA * notaB - notaC * notaD);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
