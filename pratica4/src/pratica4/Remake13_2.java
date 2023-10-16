package pratica4;

import java.util.Scanner;

public class Remake13_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Apto. Simples\n2 - Apto. Duplo");
			int apto = input.nextInt();

			System.out.println("Quantos dias você deseja ficar hospedado? ");
			int diaria = input.nextInt();
			double taxa = 0;

			if (apto == 1) {
				if (diaria < 10) {
					taxa = 100;
				} else if (diaria >= 10 && diaria <= 15) {
					taxa = 90;
				} else {
					taxa = 80;
				}
			} else if (apto == 2) {
				if (diaria < 10) {
					taxa = 140;
				} else if (diaria >= 10 && diaria <= 15) {
					taxa = 120;
				} else {
					taxa = 100;
				}
			} else {
				System.out.println("Opção inválida.");
				continuar = 'N';
				continue;
			}

			double total = diaria * taxa;
			System.out.println("Esse é o total da estadia: R$ " + total);

			System.out.println(
					"Deseja calcular a estadia para outra pessoa? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}
