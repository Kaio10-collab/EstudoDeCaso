package com.br.zup;

import java.io.IOException;
import java.util.Scanner;

public class Maior {

    public static void main(String[] args)throws IOException {

        Scanner entradaTeclado = new Scanner(System.in);

        int variavelA = Integer.parseInt(entradaTeclado.next());
        int variavelB = Integer.parseInt(entradaTeclado.next());
        int variavelS = Integer.parseInt(entradaTeclado.next());

        Integer resultado = (variavelA + variavelB + Math.abs(variavelA-variavelB))/2; // Math é uma biblioteca
        Integer resultadoFinal= (resultado + variavelS + Math.abs(resultado-variavelS))/2;

        System.out.println(resultadoFinal + " é o maior");
    }
}
