package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        int codigoPeca1 = entradaTeclado.nextInt();
        int quantidadePeca1 = entradaTeclado.nextInt();
        double valorPeca1 = Double.parseDouble(entradaTeclado.nextLine());

        int codigoPeca2 = entradaTeclado.nextInt();
        int quantidadePeca2 = entradaTeclado.nextInt();
        double valorPeca2 = Double.parseDouble(entradaTeclado.nextLine());

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("VALOR A PAGAR: R$ " + df.format((quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2)).replace(",","."));
    }
}
