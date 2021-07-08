package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        int variavelA;
        int variavelB;
        int PROD;

        variavelA = entradaTeclado.nextInt();
        variavelB = entradaTeclado.nextInt();

        PROD = variavelA * variavelB;

        System.out.println("PROD = " + PROD);
    }
}
