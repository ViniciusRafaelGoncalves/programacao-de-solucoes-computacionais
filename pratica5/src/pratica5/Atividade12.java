package pratica5;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = input.nextInt();
		for (int i = 0; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}
}
