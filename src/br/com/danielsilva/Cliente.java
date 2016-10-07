package br.com.danielsilva;

public class Cliente extends Pessoa {
	
	private double rendaMensal;
	private String dataAniversario;
	
	public Cliente(String nome, double rendaMensal, String dataAniversario) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public String getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
}
