package pratica5;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a base: ");
		int n1 = input.nextInt();
		System.out.print("Informe o expoente: ");
		int n2 = input.nextInt();
		int resultado = 1;
		for (int i = 0; i < n2; i++) {
			resultado *= n1;
		}
		System.out.print("Resultado da potenciação: " + resultado);
	}

}
