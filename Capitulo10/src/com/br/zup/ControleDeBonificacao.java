package com.br.zup;

public class ControleDeBonificacao {

    private double totalDeBonificacoes = 0;

    // registra esta recebendo qualquer referência do tipo Funcionário, pode ser objeto ou subtipos e eventualmente alguma classe que
    // que venha a ser criada.
    public void registra(Funcionario f) {
        System.out.println("Adicionando bonificação do funcionario: " + f);
        this.totalDeBonificacoes += f.getBonificacao();
    }
    //Já que o método é abstrato(Funcionário), com certeza suas subclasses têm esse método, o que garante que essa invocação de método
    // não vai falhar. Basta pensar que uma referência do tipo Funcionario nunca aponta para um objeto que não tem o método getBonificacao,
    // pois não é possível instanciar uma classe abstrata, apenas as concretas. Um método abstrato obriga a classe em que ele se
    // encontra ser abstrata, o que garante a coerência do código acima compilar.

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}