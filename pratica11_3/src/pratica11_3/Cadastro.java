package pratica11_3;

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
			System.out.println("Pessoa cadastrada com sucesso.");
		} else {
			System.out.println("Cadastro está cheio. Não é possível cadastrar mais pessoas.");
		}
	}

	public void imprimirCadastro() {
		System.out.println("\nLista de Pessoas:");
		for (int i = 0; i < totalPessoas; i++) {
			System.out.println("Nome: " + pessoas[i].getNome());
			if (pessoas[i] instanceof PessoaFisica) {
				System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCPF());
			} else if (pessoas[i] instanceof PessoaJuridica) {
				System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCNPJ());
			}
			System.out.println("--------------------------");
		}
	}
}