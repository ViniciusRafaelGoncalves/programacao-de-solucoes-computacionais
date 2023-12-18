package asc;

public class Empregado {
    private String nome;
    private double salario;
    private int anoContratacao;
    public final int ANO_BASE = 2023;

    public Empregado(String nome, double salario, int anoContratacao) {
        this.nome = nome;
        this.salario = salario;
        this.anoContratacao = anoContratacao;
    }

    public void reajustaSalario(double porcentagem) {
        setSalario(getSalario() + (porcentagem / 100 * getSalario()));
    }

    public String toString() {
        return "\n" + nome + " - " + salario + " - " + anoContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }
}