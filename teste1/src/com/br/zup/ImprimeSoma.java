package com.br.zup;

public class ImprimeSoma {
    /**
     * Imprima a soma de 1 até 1000.
     */
    public static void main(String[] args){
       int soma = 0;
       for(int i = 1; i<=1000; i++){
           soma = soma + i;
           System.out.println(i);
       }
    }
}
