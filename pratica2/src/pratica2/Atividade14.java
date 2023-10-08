package pratica2;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um comando Git (git clone, git fetch, git pull): ");
		String comando = input.nextLine();

		switch (comando) {
		case "git clone":
			System.out.println("Comando: git clone");
			System.out.println("Explicação: O comando git clone é usado para clonar um repositório Git existente.");
			System.out.println("Exemplo: git clone https://github.com/exemplo/repositorio.git");
			break;
		case "git fetch":
			System.out.println("Comando: git fetch");
			System.out.println(
					"Explicação: O comando git fetch é usado para buscar commits, arquivos e referências de um repositório remoto para o seu repositório local, mas não faz merge.");
			System.out.println("Exemplo: git fetch origin");
			break;
		case "git pull":
			System.out.println("Comando: git pull");
			System.out.println(
					"Explicação: O comando git pull é usado para buscar os commits do repositório remoto e mesclar automaticamente com o branch atual.");
			System.out.println("Exemplo: git pull origin master");
			break;
		default:
			System.out.println("Comando Git inválido.");
		}

	}
}