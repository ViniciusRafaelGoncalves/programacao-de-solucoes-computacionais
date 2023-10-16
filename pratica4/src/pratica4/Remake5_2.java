package pratica4;

import java.util.Scanner;

public class Remake5_2 {

	public static double calcularFx(double x) {
		double resultado;

		if (x < -2) {
			resultado = 2 * x + 2;
		} else if (x >= -2 && x < 3) {
			resultado = 3;
		} else {
			resultado = -x;
		}

		return resultado;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			System.out.print("Digite um valor para x: ");
			double x = input.nextDouble();

			double resultado = calcularFx(x);
			System.out.println("f(" + x + ") = " + resultado);

			System.out.println("Deseja calcular novamente? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}
