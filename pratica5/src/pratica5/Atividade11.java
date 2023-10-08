package pratica5;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int homensEntre60e80 = 0;
		int mulheresEntre50e70 = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
			char sexo = input.next().charAt(0);
			System.out.print("Digite o peso da pessoa " + i + " (em kg): ");
			double peso = input.nextDouble();

			if (sexo == 'M' && peso >= 60 && peso <= 80) {
				homensEntre60e80++;
			} else if (sexo == 'F' && peso >= 50 && peso <= 70) {
				mulheresEntre50e70++;
			}
		}

		System.out.println("Número de homens com peso entre 60 e 80 kg: " + homensEntre60e80);
		System.out.println("Número de mulheres com peso entre 50 e 70 kg: " + mulheresEntre50e70);
	}

}
