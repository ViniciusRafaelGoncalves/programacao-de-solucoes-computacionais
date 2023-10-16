package pratica4;

import java.util.Scanner;

public class Remake2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			double lado1, lado2, lado3;
			System.out.println("Digite o primeiro lado: ");
			lado1 = input.nextDouble();
			System.out.println("Digite o segundo lado: ");
			lado2 = input.nextDouble();
			System.out.println("Digite o terceiro lado: ");
			lado3 = input.nextDouble();

			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Esse é um triângulo equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Esse é um triângulo isósceles");
			} else {
				System.out.println("Esse é um triângulo escaleno");
			}

			System.out.println("Deseja verificar outro triângulo? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}
