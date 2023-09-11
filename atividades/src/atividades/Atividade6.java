package atividades;
import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	double celsius, faren;
		System.out.print("Digite a temperatura em C°: ");
		celsius = input.nextDouble();
		faren = celsius * 1.8 + 32;
		System.out.println("Temperatura em F°: "+faren);
	}
	

}
