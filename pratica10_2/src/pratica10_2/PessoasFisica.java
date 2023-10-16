package pratica10_2;
/**
 * Classe estendida de pessoa para Pessoa Fisica
 * 
 */
class PessoaFisica extends Pessoa {
	private String cpf;
/**
 * Define o cpf
 * 
 */
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
/**
 * Armazena o cpf 
 * 
 * @return CPF
 */
	public String getCPF() {
		return cpf;
	}
}
