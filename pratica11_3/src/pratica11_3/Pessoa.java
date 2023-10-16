package pratica11_3;

import java.util.Scanner;

class Pessoa {
	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

class PessoaFisica extends Pessoa {
	private String cpf;

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCPF() {
		return cpf;
	}
}
