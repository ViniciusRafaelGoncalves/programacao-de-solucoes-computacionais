package pratica4;

import java.util.Scanner;

public class Remake12_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			System.out.print("Digite sua idade: ");
			int idade = input.nextInt();
			double taxa = 0;
			System.out.println("1 - Masculino\n2 - Feminino");

			System.out.print("Escolha uma opção: ");
			int sexo1 = input.nextInt();
			if (sexo1 == 1) {
				if (idade <= 15) {
					taxa = 60;
				} else if (idade <= 18) {
					taxa = 75;
				} else if (idade <= 30) {
					taxa = 90;
				} else if (idade <= 40) {
					taxa = 85;
				} else {
					taxa = 90;
				}
			} else if (sexo1 == 2) {
				if (idade <= 18) {
					taxa = 60;
				} else if (idade <= 25) {
					taxa = 90;
				} else if (idade <= 40) {
					taxa = 85;
				} else {
					taxa = 80;
				}
			} else {
				System.out.println("Opção de sexo inválida.");
				continuar = 'N';
				continue; 
			}

			System.out.println("Mensalidade a ser paga: R$ " + taxa);

			System.out.println(
					"Deseja calcular a mensalidade para outra pessoa? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}
