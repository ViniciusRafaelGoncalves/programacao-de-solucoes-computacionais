package pratica10_2;
/**
 * Classe estendida de Pessoa para Pessoa Juridica
 * 
 */
class PessoaJuridica extends Pessoa {
	private String cnpj;
/**
 * Define o cnpj
 * 
 * @param cnpj
 */
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
/**
 * Armazena o cnpj
 * 
 * @return cnpj
 */
	public String getCNPJ() {
		return cnpj;
	}
}