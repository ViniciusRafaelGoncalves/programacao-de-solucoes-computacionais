package atividades;
import java.util.Scanner;
public class Atividades2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int niver, idade, ano2050, anoatual;
			System.out.println("Informe o ano em que você nasceu: ");
			niver = input.nextInt();
			System.out.println("Informe o ano atual: ");
			anoatual = input.nextInt();
			idade = (anoatual - niver);
			System.out.println("Essa é a sua idade: " + idade);
			ano2050 = 2050;
			System.out.println("Essa é a sua idade em 2050: " + (ano2050 - anoatual + idade));
			
				
	}

}
