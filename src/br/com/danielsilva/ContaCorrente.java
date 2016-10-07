package br.com.danielsilva;

public class ContaCorrente extends ContaBancaria {

	private double taxaDeOperacao;

	public ContaCorrente(int numeroDaConta, String cliente, String gerente, double saldo) {
		super(numeroDaConta, cliente, gerente, saldo);
		this.taxaDeOperacao = taxaDeOperacao;
	}
	
	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}

	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}

	@Override
	public void sacar(double valorSacar) {
		setSaldo (getSaldo () - valorSacar);
		
	}

	@Override
	public void depositar(double valorDepositar) {
		setSaldo (getSaldo () + valorDepositar);
	}
	
}
