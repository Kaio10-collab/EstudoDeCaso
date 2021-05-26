package com.br.zup;

public class Main {

    public static void main(String[] args) {
	Conta c1 = new Conta();
	c1.titular = "Kaio";
	c1.saldo = 227;

	Conta c2 = new Conta();
	c2.titular = "Tai";
	c2.saldo = 227;

	// transferindo saldo da conta1 kaio para a conta2 Tai.
	c1.transfere(c2,100);
    }
}