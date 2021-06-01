package com.br.zup;

public class Static {

    public static String SO;
    public static String versaojava;
    public int num = 0;
    public static double[] aleatorios = new double[10];

    static {
        SO = System.getProperty("os.name");
        System.out.println(SO);
        versaojava = System.getProperty("java.version");
        System.out.println(versaojava);
        float versao = Float.valueOf(versaojava.substring(0, 3));
        if (versao < 1.5){
            System.out.println ("Instale uma versão 1.5 ou mais recente da JVM.");
            System.exit(1);
        }
        System.out.println(System.getProperties());
    }

    static {
        for (int i = 0; i < aleatorios.length; i++)
            aleatorios[i] = Math.random();
    }

    public static void Imprime() {
        System.out.println("metodo estatico Imprime sendo executado");
        for (int i = 0; i < aleatorios.length; i++)
            System.out.println(aleatorios[i]);
    }
}
