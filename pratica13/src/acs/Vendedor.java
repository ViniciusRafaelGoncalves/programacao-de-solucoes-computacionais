package acs;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase,
			double inss, double comissao, double valorVendas) {
		super(nome, idade, peso, altura, numeroSecao, salarioBase, inss);
		this.comissao = comissao;
		this.valorVendas = valorVendas;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
@Override
public double calcularSalario() {
	return super.calcularSalario() + (valorVendas * comissao/100);
}
@Override
public String getInfo() {
	return super.getInfo() + ", Comissão: " + comissao + ", Valor de Vendas: " + valorVendas;
}

}
