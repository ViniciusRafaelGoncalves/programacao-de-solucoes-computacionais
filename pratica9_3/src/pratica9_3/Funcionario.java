package pratica9_3;
/*
 * Criando a classe funcionário
 * 
 */
public class Funcionario {
	private String nome, cargo, endereço, telefone;
	private int idade;
	private double salario;
/*
 * O método funcionário foi criado e será chamado na classe main
 * 
 */
	public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereço) {
		this.nome = nome;
		this.cargo = cargo;
		this.endereço = endereço;
		this.telefone = telefone;
		this.idade = idade;
		this.salario = salario;
	}
/*
 * Irá exibir as informações do vetor
 * 
 */
	public String exibe() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nCargo: " + cargo + "\nSalário: " + salario + "\nTelefone: "
				+ telefone + "\nEndereço: " + endereço;
	}

}
