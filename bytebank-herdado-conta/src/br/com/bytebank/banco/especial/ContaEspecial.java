package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);// chama o construtor da classe mãe
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub

	}

}
