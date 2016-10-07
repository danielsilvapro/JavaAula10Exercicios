package br.com.danielsilva;

public abstract class ContaBancaria {

	private int numeroDaConta;
	private String cliente;
	private String gerente;
	private double saldo;
	
	
	public ContaBancaria(int numeroDaConta, String cliente, String gerente, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.cliente = cliente;
		this.gerente = gerente;
		this.saldo = saldo;
	}
	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void sacar (double valorSacar);
	public abstract void depositar (double valorDepositar);
	
}
