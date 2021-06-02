package com.br.zup;

public class Main {

    public static void main(String[] args) {
        Gerentes gerente = new Gerentes();

        // podemos chamar métodos do Funcionario:
        gerente.setNome("João da Silva");

        // e também métodos do Gerente!
        gerente.setSenha(4231);

        // estamos setando o atributo salário que esta na classe funcionario, pois o mesmo esta extendido na classe gerente.
        Gerentes gerente1 = new Gerentes();
        gerente1.setSalario(5000.0);
        System.out.println(gerente1.getBonificacao());

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000.0);
        System.out.println(funcionario.getBonificacao());

        Ceo ceo = new Ceo();
        ceo.setSalario(6000);
        System.out.println(ceo.getBonificacao());
    }
}