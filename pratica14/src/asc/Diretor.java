package asc;

public class Diretor extends Empregado {
    private String departamento;

    public Diretor(String nome, double salario, int anoContratacao, String departamento) {
        super(nome, salario, anoContratacao);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return super.toString() + " - Departamento: " + departamento;
    }
}
