package pratica5;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalIdades = 0;
		int qnt = 0;
		System.out.println("Informe sua idade (ou um número negativo para sair): ");
		while (true) {
			System.out.print("Idade: ");
			int idade = input.nextInt();
			if (idade < 0) {
				break;
			}
			totalIdades += idade;
			qnt++;

		}
		double media = (double) totalIdades / qnt;
		System.out.println("A média das idades é: " + media);
		input.close();
	}
}
