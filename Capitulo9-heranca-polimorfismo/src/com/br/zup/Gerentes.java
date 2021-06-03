package com.br.zup;

/**
 * Estmaos criando uma relação de classe mãe e filha. Sendo a classe mãe Funcionario e a filha Gerentes, e a classse filha
 * esta herdando os atributos da classe mãe.
 */
public class Gerentes extends Funcionario {

    private int senha;
    private int numeroDeFuncionariosGerenciados;

    @Override //chamado de anotação. Há como deixar explícito no seu código que um determinado método é a reescrita de
    // um método da sua classe mãe.
    public double getBonificacao() {
        return this.salario * 0.15;
    } // depois que foi reescrito o método não pode ser mais invocado, porém podemos invocar dentro da classe.

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}