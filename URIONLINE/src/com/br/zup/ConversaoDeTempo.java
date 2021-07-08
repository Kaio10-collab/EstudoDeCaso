package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args) throws IOException {

        Scanner entradaTerminal = new Scanner(System.in);

        int valorInteiro = Integer.parseInt(entradaTerminal.nextLine());

        int horas = (valorInteiro / 60) / 60;
        int minutos = (valorInteiro - (horas*60*60)) / 60;
        int segundos = (valorInteiro - (minutos*60)) % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    } // %d indica que estarei colocando uma variável
}
/*
Scanner entradaTerminal = new Scanner(System.in);

        int x, horas, minutos, segundos;
        x = Integer.parseInt(entradaTerminal.nextLine());
        segundos=x%60;
        minutos=x/60;//neste ponto, os minutos ainda não foram convertidos em hora. Ou seja, deve-se dividir por 60 para obter-se o valor de horas. E o resto dessa divisão será o valor em minutos
        horas = minutos/60;
        minutos=minutos%60;

        System.out.println(horas+":"+minutos+":"+segundos);
 */
