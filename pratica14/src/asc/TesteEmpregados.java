package asc;

public class TesteEmpregados {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Gerente gerente = new Gerente("Gerente1", 50000.0, 2020, "Secretaria1");
		empresa.adicionaEmpregado(gerente);
		empresa.adicionaEmpregado(new Empregado("João", 50000.0, 2020));
		empresa.adicionaEmpregado(new Gerente("Maria", 70000.0, 2018, "RH"));
		empresa.adicionaEmpregado(new Diretor("Carlos", 100000.0, 2015, "Financeiro"));
		empresa.reajustaSalarios(10.0);
		String listaEmpregados = empresa.mostrEmpregados();
		System.out.println("Lista de Empregados:\n" + listaEmpregados);
	}
}
