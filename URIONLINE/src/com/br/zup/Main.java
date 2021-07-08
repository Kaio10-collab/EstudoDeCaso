package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        int variavelA;
        int variavelB;
        int soma;

        variavelA = entradaTeclado.nextInt();
        variavelB = entradaTeclado.nextInt();

        soma = variavelA + variavelB;

        System.out.println("X = " + soma);
    }
}
