package com.br.zup;

public class ImprimeFatorais {
    /**
     * Imprima os fatoriais de 1 a 10.
     */
    public static void main(String[] args){
        int fatorial = 1;
        for (int n = 1; n<=10;n++){
            fatorial = fatorial * n;
            System.out.println("fat(" + n +")=" + fatorial);
        }
    }
}
