package pratica11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("O nome do produto 1: ");
		String nome1 = input.nextLine();
		System.out.println("O preço do produto 1: ");
		double preço1 = input.nextDouble();
		Produto produto1 = new Produto(nome1, preço1);
		System.out.println("Digite o nome do produto 2: ");
		input.nextLine();
		String nome2 = input.nextLine();
		System.out.println("Digite o preço do produto 2: ");
		double preco2 = input.nextDouble();

		Produto produto2 = new Produto(nome2, preco2);

		System.out.print("Digite o percentual de reajuste: ");
		double percentualReajuste = input.nextDouble();

		produto1.reajustaPreço(percentualReajuste);
		produto2.reajustaPreço(percentualReajuste);

		System.out.println("\nInformações do produto 1:");
		produto1.exibe();
		System.out.println("\nInformações do produto 2:");
		produto2.exibe();
		System.out.println("\nÚltimo id gerado: " + Produto.getUltimo_id());

		input.close();
	}
}