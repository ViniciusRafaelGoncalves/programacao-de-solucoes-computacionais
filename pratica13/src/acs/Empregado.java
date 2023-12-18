package acs;

public class Empregado extends Pessoa {
	private int numeroSecao;
	private double salarioBase;
	private double inss;

	public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase,
			double inss) {
		super(nome, idade, peso, altura);
		this.numeroSecao = numeroSecao;
		this.salarioBase = salarioBase;
		this.inss = inss;
	}

	public int getNumeroSecao() {
		return numeroSecao;
	}

	public void setNumeroSecao(int numeroSecao) {
		this.numeroSecao = numeroSecao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double calcularSalario() {
		return salarioBase - (salarioBase * inss / 100);
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", Número Seção: " + numeroSecao + ", Salário Base: " + salarioBase + ". INSS: "
				+ inss;
	}
}