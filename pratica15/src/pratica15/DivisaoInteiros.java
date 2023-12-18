package pratica15;

import java.util.Scanner;

public class DivisaoInteiros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Digite o numerador (dividendo): ");
			int numerador = input.nextInt();

			System.out.print("Digite o denominador (divisor): ");
			int denominador = input.nextInt();

			int resultado = realizarDivisao(numerador, denominador);

			System.out.println("Resultado da divisão: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		} finally {

			input.close();
		}
	}

	private static int realizarDivisao(int numerador, int denominador) {
		if (denominador == 0) {

			throw new ArithmeticException("Divisão por zero não é permitida.");
		}

		return numerador / denominador;
	}
}