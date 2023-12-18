package acs;

public class Administrador extends Empregado {
	private double ajudaDeCusto;

	public Administrador(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase,
			double inss, double ajudaDeCusto) {
		super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + ajudaDeCusto;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", Ajuda de Custo: " + ajudaDeCusto;
	}
}