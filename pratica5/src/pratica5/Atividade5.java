package pratica5;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorN = Integer.MIN_VALUE;
		int menorN = Integer.MAX_VALUE;
		System.out.println("Informe os números desejados (ou um número negativo para sair): ");
		while (true) {
			System.out.print("Número: ");
			int numero = input.nextInt();
			
			if (numero < 0) {
				break;
			}
			if (numero < menorN) {
				menorN = numero;
			}
			if (numero > maiorN) {
				maiorN = numero;
			}
		}
		System.out.println("Menor número: " + menorN);
		System.out.println("Maior número: " + maiorN);
		input.close();
	}

}
