package pratica4;

import java.util.Scanner;

public class Remake11_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			System.out.print("Digite seu tempo de estadia no hotel: ");
			int estadia = input.nextInt();
			double diaria = 500;

			double taxa;
			if (estadia < 15) {
				taxa = 15;
			} else if (estadia == 15) {
				taxa = 10;
			} else {
				taxa = 5;
			}

			double total = (estadia * diaria) + (estadia * taxa);
			System.out.println("Total a ser pago pelo cliente: R$ " + total);

			System.out.println(
					"Deseja calcular o total para outra estadia? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}