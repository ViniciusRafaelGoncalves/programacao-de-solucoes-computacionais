package pratica_12;

class Cadastro {
	private Pessoa[] pessoas;
	private int totalPessoas;

	public Cadastro(int tamanho) {
		pessoas = new Pessoa[tamanho];
		totalPessoas = 0;
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		if (totalPessoas < pessoas.length) {
			pessoas[totalPessoas] = pessoa;
			totalPessoas++;
			System.out.println("Pessoa cadastrada com sucesso!");
		} else {
			System.out.println("Cadastro completo. Não é possível cadastrar mais pessoas.");
		}
	}

	public void imprimirCadastro() {
		System.out.println("Cadastro de Pessoas:");
		for (int i = 0; i < totalPessoas; i++) {
			System.out.println("Nome: " + pessoas[i].getNome());
			if (pessoas[i] instanceof PessoaFisica) {
				System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCpf());
			} else if (pessoas[i] instanceof PessoaJuridica) {
				System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCnpj());
			}
			System.out.println("--------------");
		}
	}
}