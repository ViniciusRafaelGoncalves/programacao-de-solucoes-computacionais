package pratica2;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		double taxa = 0;
		System.out.println("1 - Masculino\n2 - Feminino");

		System.out.print("Escolha uma opção: ");
		int sexo1 = input.nextInt();
		if (sexo1 == 1) {
			if (idade <= 15){
				taxa = 60;
			}else if(idade == 16 || idade <=18) {
				taxa = 75;
			}else if(idade == 19 || idade <= 30) {
				taxa = 90;
			}else if(idade == 31 || idade <=40) {
				taxa = 85;
			}else {
				taxa=90;
			}
		}else if(sexo1 == 2) {
			if (idade <= 18){
				taxa = 60;
			}else if(idade == 19 || idade <=25) {
				taxa = 90;
			}else if(idade == 26 || idade <= 40) {
				taxa = 85;
			}else {
				taxa=80;
			}
		}else {
			System.out.println("Opção de sexo inválida.");
		}
		 System.out.println("Mensalidade a ser paga: R$ " + taxa);


	}

}
