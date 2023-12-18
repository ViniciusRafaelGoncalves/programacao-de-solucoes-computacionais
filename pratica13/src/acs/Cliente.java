package acs;

public class Cliente extends Pessoa {
	private double credMax;
	private double valorEmDivida;

	public Cliente(String nome, int idade, double altura, double peso, double valorEmDivida, double credMax) {
		super(nome, idade, peso, altura);
		this.credMax = credMax;
		this.valorEmDivida = valorEmDivida;
	}

	public double getCredMax() {
		return credMax;
	}

	public void setCredMax(double credMax) {
		this.credMax = credMax;
	}

	public double getValorEmDivida() {
		return valorEmDivida;
	}

	public void setValorEmDivida(double valorEmDivida) {
		this.valorEmDivida = valorEmDivida;
	}

	public double obterSaldo() {
		return credMax - valorEmDivida;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", Crédito Máximo: " + credMax + ", Valor em Dívida: " + valorEmDivida;
	}
}