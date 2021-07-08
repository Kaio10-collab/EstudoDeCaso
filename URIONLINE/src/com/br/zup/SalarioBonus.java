package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioBonus {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        String nomeTrabalhador;
        double salarioFixo;
        double totalVendas;
        double totalMontante;
        double percetual = 0.15;

        nomeTrabalhador = entradaTeclado.nextLine();

        salarioFixo = Double.parseDouble(entradaTeclado.nextLine());

        totalVendas = Double.parseDouble(entradaTeclado.nextLine());

        totalMontante = (totalVendas * percetual) + salarioFixo;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("TOTAL = R$ " + df.format(totalMontante).replace(",","."));

    }
}
