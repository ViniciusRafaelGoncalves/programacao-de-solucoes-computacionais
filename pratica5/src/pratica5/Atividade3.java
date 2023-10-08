package pratica5;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número desejado: ");
		int n = input.nextInt();
		int fat = 1;
		if(n<0) {
			System.out.println("Erro: Número Inválido");
		return;
		}
		for (int i = 1; i <= n; i++) {
			fat *= i;
			
		}
		System.out.println(n + "! = " + fat);
		input.close();
	}
}