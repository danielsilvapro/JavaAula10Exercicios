package br.com.danielsilva;

public class Funcionario extends Pessoa {

	private double salario;
	
	public Funcionario(String nome, double salario) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
