package asc;

public class Gerente extends Empregado {
	private String nomeSecretaria;

	public Gerente(String nome, double salario, int anoContratacao, String nomeSecretaria) {
		super(nome, salario, anoContratacao);
		this.nomeSecretaria = nomeSecretaria;
	}

	@Override
	public void reajustaSalario(double porcentagem) {
		double bonus = (ANO_BASE - getAnoContratacao());
		super.reajustaSalario(porcentagem + bonus);
	}
}
