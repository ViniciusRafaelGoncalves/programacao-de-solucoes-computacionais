package pratica11_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cadastro cadastro = new Cadastro(10);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1 - Cadastrar Pessoa Física");
			System.out.println("2 - Cadastrar Pessoa Jurídica");
			System.out.println("3 - Imprimir Cadastro");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = input.nextInt();
			input.nextLine();
			switch (opcao) {
			case 1:
				PessoaFisica pessoaFisica = new PessoaFisica();
				System.out.print("Digite o nome: ");
				pessoaFisica.setNome(input.nextLine());
				System.out.print("Digite o CPF: ");
				pessoaFisica.setCPF(input.nextLine());
				cadastro.cadastrarPessoa(pessoaFisica);
				break;
			case 2:
				PessoaJuridica pessoaJuridica = new PessoaJuridica();
				System.out.print("Digite o nome: ");
				pessoaJuridica.setNome(input.nextLine());
				System.out.print("Digite o CNPJ: ");
				pessoaJuridica.setCNPJ(input.nextLine());
				cadastro.cadastrarPessoa(pessoaJuridica);
				break;
			case 3:
				cadastro.imprimirCadastro();
				break;
			case 4:
				System.out.println("Saindo do programa. Até mais!");
				input.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}
