package pratica9_3;
/*
 * Criação da classe main 
 * 
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * Limitando a quantidade de cadastros
		 * 
		 */
		Cadastro cadastro = new Cadastro(3);
		System.out.println("Digite seu nome: ");
		/*
		 * Instanciando os funcionários
		 * 
		 */
		Funcionario funcionario1 = new Funcionario("João", 30, "Analista", 3000.50, "123456789", "Rua A, 123");
		Funcionario funcionario2 = new Funcionario("Maria", 25, "Gerente", 5000.75, "987654321", "Rua B, 456");
		Funcionario funcionario3 = new Funcionario("Carlos", 35, "Assistente", 2500.00, "111223344", "Rua C, 789");
		/*
		 * Testando o limite de funcionários
		 * 
		 */
		cadastro.cadastrarFuncionario(funcionario1);
		cadastro.cadastrarFuncionario(funcionario2);
		cadastro.cadastrarFuncionario(funcionario3);
		/*
		 * Chamando o método exibe
		 * 
		 */
		cadastro.imprimirCadastro();
	}
}
