package pratica5;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = input.nextInt();
		if (n1<=0) {
			 System.out.println("Por favor, digite um número inteiro positivo.");
	            return;
		}
		System.out.println("Digite o segundo número: ");
		int n2 = input.nextInt();
		if (n2<=0) {
			 System.out.println("Por favor, digite um número inteiro positivo.");
	            return;
		}
		
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
			input.close();
		}
	}

}
