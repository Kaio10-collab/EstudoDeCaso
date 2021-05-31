package com.br.zup;

public class Main {

    public static void main(String[] args) {
	// Arquivo JAR ou chamado de Java ARchive, possui um conjunto de classes compactados, no estilo de um arquivo ZIP.
    // O arquivo JAR pode ser criado com qualquer compactador zip disponível no mercado, inclusive o programa jar que vem junto com o JDK.

    // Para criamos um arquivo jar, é acessar o diretório onde estão contidas as classes e usar o comando abaixo para criar o arquivo
    // com todas as classes dos pacotes criados.(Exemplos de nomes de pacotes br.com.caelum.util e br.com.caelum.banco).
    // jar -cvf banco.jar br/com/caelum/util/*.class br/com/caelum/banco/*.class

    // Para utilizar o arquivo banco.jar, basta utilizar o seguinte comando:
    // java -classpath banco.jar br.com.caelum.contas.main.TesteDoBanco

    //Para adicionar mais arquivos .jar, que podem ser bibliotecas, ao programa basta rodar o java da seguinte maneira:
    //java -classpath biblioteca1.jar;biblioteca2.jar NomeDaClasse

        /**
         * Vale lembrar que o ponto e vírgula utilizado só é válido em ambiente Windows.
         * Em Linux, Mac e outros Unix, é o dois pontos (varia de acordo com o sistema operacional).
         */

        // Arquivo | Estrutura do Projeto | Artefatos, em seguida, você deve pressionar alt + insert ou clique no ícone
        // de mais(+) e criar novo artefato escolha -> jar -> De módulos com dependencies. Para gerar um JAR no intellij
    }
}