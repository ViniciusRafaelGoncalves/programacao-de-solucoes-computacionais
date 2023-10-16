package pratica10_2;
/**
 * Classe cadastro
 * 
 */
public class Cadastro {
	private Pessoa[] pessoas;
	private int contador;
/**
 * Define o contador
 * 
 * @param tamanho
 */
	public Cadastro(int tamanho) {
		pessoas = new Pessoa[tamanho];
		contador = 0;
	}
/**
 * Método de cadastrar pessoas
 * 
 * @param pessoa
 */
	public void cadastrarPessoa(Pessoa pessoa) {
		if (contador < pessoas.length) {
			pessoas[contador] = pessoa;
			contador++;
		} else {
			System.out.println("Erro: Não é possível cadastrar mais pessoas. Limite atingido.");
		}
	}
/**
 * Método de imprimir o cadastro
 * 
 */
	public void imprimirCadastro() {
		for (int i = 0; i < contador; i++) {
			System.out.println("Pessoa " + (i + 1) + ": " + pessoas[i].getNome());
		}
	}
}