package pratica2;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Apto. Simples\n2 - Apto. Duplo");
		int apto = input.nextInt();
		System.out.println("Quantos dias você deseja ficar hospedado? ");
		int diaria = input.nextInt();
		double taxa = 0;

		if (apto == 1) {
			if (diaria < 10) {
				taxa = 100;
			} else if (diaria >= 10 || diaria <= 15) {
				taxa = 90;
			} else {
				taxa = 80;
			}
		} else if (apto == 2) {
			if (diaria < 10) {
				taxa = 140;
			} else if (diaria >= 10 || diaria <= 15) {
				taxa = 120;
			} else {
				taxa = 100;

			}

		}
		double total = (diaria*taxa);
		System.out.println("Esse é o total da estadia: " + total);
	}

}
