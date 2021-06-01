package com.br.zup;

public class TarefaTai {
    /**
     * modificadores de acesso é que são definidos sempre em palavras minúsculas, tais como FINAL, NATIVE, STATIC, SYNCHRONIZED e VOLATILE
     *
     * O uso do modificador STATIC em um atributo de classe, por exemplo, torna esse atributo possível de ser inicializado
     * em qualquer parte da classe, mas quando recebe um valor, ele é compartilhado com todos os objetos da classe.
     * Isso significa que os atributos estáticos de uma classe são compartilhados por todas as instâncias dessa classe.
     *
     * Os atributos estáticos normalmente são utilizados na padronização de valores (constantes) dentro do projeto/sistema, visando compartilhamento
     * de informações entre os objetos e para acesso direto aos atributos da classe sem a necessidade de existir algum objeto instanciado dessa classe.
     *
     * O modificador FINAL por sua vez, torna o atributo da classe uma constante e, só pode ser inicializado uma única vez,
     * ou diretamente na declaração da classe ou no método construtor. Quando um atributo recebe os modificadores de acesso
     * STATIC e FINAL, sua inicialização apresenta uma alteração distinta, o atributo não poderá mais ser inicializado no método construtor,
     * sendo possível sua inicialização apenas diretamente na declaração do atributo ou no bloco de inicialização estático.
     *
     * O modificador FINAL vai garantir que não será sobrescrito em cima dos métodos, somente será executado o código através de um dos objetos
     * da classe ou de classes herdeiras. Por isso é garantido uma maior segurança pois estará evitando que a subclasse possa ter o mesmo
     * protótipo mas com implementação diferente, abrindo margem para que o código possa ser sobrescrito por algum código malicioso.
     *
     * Quando estamos utilizando para atributos, eles passam a serem constantes, ou seja, uma vez inicializado, não poderá ter o seu valor
     * alterado e qualquer tentativa de alterar irá retornar erro de compilação. Outra particularidade do operador FINAL,
     * quando aplicado aos atributos, é que apenas os tipos primitivos (byte, short, int, long, char, float, double e boolean)
     * permanecem com seus valores constantes. Sua aplicação aos atributos que sejam objetos ou vetores também é permitida,
     * no entanto, nesses casos, apenas a referência ao objeto ou ao vetor é fixa, ou seja, os valores dos atributos do objeto FINAL
     * ou os valores contidos nas posições do vetor FINAL podem ser alterados, mas impede que sejam instanciados novamente.
     *
     * O modificador FINAL também pode ser aplicado aos parâmetros de um método, os quais não poderão ser modificados no escopo do método,
     * protegendo e garantindo que os valores/objetos recebidos como parâmetro terão seus valores/referências mantidas no interior do método
     * durante a execução.
     *
     * O uso do especificador FINAL pode conferir segurança ao código e maior velocidade de execução. O especificador STATIC
     * confere economia de memória e a possibilidade de troca de informações entre os objetos da classe.
     * https://www.devmedia.com.br/modificadores-de-acesso-do-java/27065
     */
}
