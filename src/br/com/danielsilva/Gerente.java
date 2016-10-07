package br.com.danielsilva;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public void aplicarBonificacao (double valorBonificacao){
		
		this.setSalario(this.getSalario() + valorBonificacao);
		
	}

}
