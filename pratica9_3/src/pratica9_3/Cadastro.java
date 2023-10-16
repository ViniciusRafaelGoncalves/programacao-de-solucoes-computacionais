package pratica9_3;
/*
 * Classe cadastro e vetor criados
 * 
 */
public class Cadastro {
	private Funcionario[] funcionarios;
	private int contador;
/*
 * Método cadastro pra limitar a quantidade de funcionários
 * 
 */
	public Cadastro(int tamanho) {
		funcionarios = new Funcionario[tamanho];
		contador = 0;
	}
/*
 * Método pra cadastrar os funcionários e mensagem de erro caso cadastre mais funcionários que o limite
 * 
 */
	public void cadastrarFuncionario(Funcionario funcionario) {
		if (contador < funcionarios.length) {
			funcionarios[contador] = funcionario;
			contador++;
		} else {
			System.out.println("Erro: Não é possível cadastrar mais funcionários!!");
		}
	}
/*
 * Detalhes dos funcionarios e chamando o método exibe
 * 
 */
	public void imprimirCadastro() {
		for (int i = 0; i < contador; i++) {
			System.out.println("Funcionário " + (i + 1) + ":");
			System.out.println(funcionarios[i].exibe() + "\n");
		}
	}
}
