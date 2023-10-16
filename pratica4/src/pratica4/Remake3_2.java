package pratica4;

import java.util.Scanner;

public class Remake3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			double nota1, nota2, nota3, media;
			System.out.println("Digite sua primeira nota: ");
			nota1 = input.nextDouble();
			input.nextLine(); 

			System.out.println("Digite sua segunda nota: ");
			nota2 = input.nextDouble();
			input.nextLine(); 

			System.out.println("Digite sua terceira nota: ");
			nota3 = input.nextDouble();
			input.nextLine();

			media = (nota1 + nota2 + nota3) / 3;

			if (media >= 0 && media < 3) {
				System.out.println("Reprovado");
			} else if (media >= 3 && media < 7) {
				System.out.println("Exame");
			} else if (media >= 7 && media <= 10) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Média inválida");
			}

			System.out.println("Deseja calcular a média de outro aluno? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);
			input.nextLine(); 

		} while (continuar == 'S' || continuar == 's');
	}
}
