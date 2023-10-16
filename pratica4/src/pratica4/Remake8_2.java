package pratica4;

import java.util.Scanner;

public class Remake8_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char continuar;

		do {
			System.out.print("1-Sapato\n2-Bolsa\n3-Camisa\n4-Calça\n5-Blusa\n");
			System.out.print("Informe o código do produto (1 a 5): ");
			int codigo = input.nextInt();

			double preco = 0.0;

			switch (codigo) {
			case 1:
				preco = 99.99;
				break;
			case 2:
				preco = 103.89;
				break;
			case 3:
				preco = 49.98;
				break;
			case 4:
				preco = 89.72;
				break;
			case 5:
				preco = 97.35;
				break;
			default:
				System.out.println("Código de produto inválido.");
				break;
			}

			if (preco > 0) {
				System.out.println("O preço do produto é R$" + preco);
			}

			System.out
					.println("Deseja verificar o preço de outro produto? (S para Sim, qualquer outra tecla para sair)");
			continuar = input.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
	}
}
