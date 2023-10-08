package pratica5;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pessoas = 0;
		int totalPessoas = 10;
		for (int i = 1; i <= totalPessoas; i++) {
			System.out.print("Digite a idade da pessoa " + i + ": ");
			int idade = input.nextInt();
			pessoas += idade;
		}
		double media = pessoas / totalPessoas;
		System.out.println("A média das idades é: " + media);
		input.close();
	}

}
