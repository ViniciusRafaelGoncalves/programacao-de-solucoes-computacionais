package pratica4;

import java.util.Scanner;

public class Remake6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			double x, y, z;

			System.out.print("Informe o primeiro lado em cm:");
			x = input.nextInt();
			System.out.print("Informe o segundo lado em cm:");
			y = input.nextInt();
			System.out.print("Informe o terceiro lado em cm:");
			z = input.nextInt();

			boolean tipo1 = Math.abs(y - z) < x && x < y + z;
			boolean tipo2 = Math.abs(z - x) < y && y < z + x;
			boolean tipo3 = Math.abs(x - y) < z && z < x + y;

			if (tipo1 && tipo2 && tipo3) {
				System.out.println(
						"Resposta: os três valores informados podem ser os comprimentos dos lados de um triângulo.");
			} else {
				System.out.println(
						"Resposta: os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo.");
			}

			System.out
					.println("Deseja verificar outro conjunto de lados? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}
