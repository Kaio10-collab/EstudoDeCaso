package com.br.zup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GastoDeCombustivel {

    public static void main(String[] args) throws IOException {

        Scanner entradaTerminal = new Scanner(System.in);

        double tempoGasto = entradaTerminal.nextInt();
        double velocidadeMedia = entradaTerminal.nextInt();
        double litrosViagem;

       DecimalFormat df = new DecimalFormat("0.000");

        litrosViagem = (tempoGasto*velocidadeMedia) / 12;

        System.out.println(df.format(litrosViagem).replace(",","."));
    }
}
