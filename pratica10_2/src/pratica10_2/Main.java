package pratica10_2;

import java.util.Scanner;
/**
 * Classe main
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cadastro cadastro = new Cadastro(10);
		System.out.print("Deseja cadastrar uma pessoa? (S/N): ");
		String resposta = input.next();
/**
 * Definição do loop e maneira de continuar os cadastros
 * 
 */
		while (resposta.equalsIgnoreCase("S")) {
			System.out.print("Nome: ");
			String nome = input.next();

			System.out.print("É pessoa física ou jurídica? (F/J): ");
			String tipo = input.next();

			if (tipo.equalsIgnoreCase("F")) {
				PessoaFisica pessoaFisica = new PessoaFisica();
				pessoaFisica.setNome(nome);

				System.out.print("CPF: ");
				String cpf = input.next();
				pessoaFisica.setCPF(cpf);

				cadastro.cadastrarPessoa(pessoaFisica);
			} else if (tipo.equalsIgnoreCase("J")) {
				PessoaJuridica pessoaJuridica = new PessoaJuridica();
				pessoaJuridica.setNome(nome);

				System.out.print("CNPJ: ");
				String cnpj = input.next();
				pessoaJuridica.setCNPJ(cnpj);

				cadastro.cadastrarPessoa(pessoaJuridica);
			} else {
				System.out.println("Opção inválida.");
			}

			System.out.print("Deseja cadastrar outra pessoa? (S/N): ");
			resposta = input.next();
		}
		cadastro.imprimirCadastro();
		input.close();
	}
}