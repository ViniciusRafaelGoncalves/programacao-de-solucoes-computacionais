package pratica5;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int n1 = input.nextInt();
		StringBuilder numerosImpares = new StringBuilder();
		for (int i = 0; i <= n1; i++) {
			if (i % 2 != 0) {
                if (numerosImpares.length() > 0) {
                    numerosImpares.append(", ");
                }
                numerosImpares.append(i);
            }
        }
        
        System.out.println("Números ímpares de 1 até " + n1 + ": " + numerosImpares);
    }
}