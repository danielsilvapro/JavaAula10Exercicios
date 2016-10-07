package br.com.danielsilva;

public class ContaPoupanca extends ContaBancaria {

	private double limite;
	
	public ContaPoupanca(int numeroDaConta, String cliente, String gerente, double saldo, double limite) {
		super(numeroDaConta, cliente, gerente, saldo);
		this.limite = limite;
	}

	@Override
	public void sacar(double valorSacar) {
		if (valorSacar > (getSaldo() + limite)) {
			System.out.println("Você não tem limite sulficiente para efetuar este saque");
		}else {
			setSaldo (getSaldo () - valorSacar);
			System.out.println("Saque no valor de" + " " + valorSacar + " " + "efetaudo com sucesso");
		}
	}

	@Override
	public void depositar(double valorDepositar) {
		setSaldo (getSaldo () + valorDepositar);
		System.out.println("Deposito efetuado com sucesso " +  getSaldo());
	}

}
