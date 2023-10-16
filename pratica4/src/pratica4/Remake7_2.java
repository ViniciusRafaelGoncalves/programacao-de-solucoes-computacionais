package pratica4;

import java.util.Scanner;

public class Remake7_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			System.out.print("Informe o coeficiente 'a': ");
			double a = input.nextDouble();

			System.out.print("Informe o coeficiente 'b': ");
			double b = input.nextDouble();

			System.out.print("Informe o coeficiente 'c': ");
			double c = input.nextDouble();

			double delta = b * b - 4 * a * c;

			if (a == 0 && b == 0 && c == 0) {
				System.out.println("Igualdade confirmada: 0 = 0");
			} else if (a == 0 && b == 0 && c != 0) {
				System.out.println("Coeficientes informados incorretamente");
			} else if (a == 0 && b != 0) {
				System.out.println("Esta é uma equação de primeiro grau: x = " + (-c / b));
			} else {
				System.out.println("Esta é uma equação de segundo grau.");

				if (delta < 0) {
					System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + delta);
				} else if (delta == 0) {
					double x = -b / (2 * a);
					System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
				} else {
					double x1 = (-b + Math.sqrt(delta)) / (2 * a);
					double x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = "
							+ x1 + ", x'' = " + x2);
				}
			}

			System.out.println("Deseja verificar outra equação? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}
