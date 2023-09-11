package atividades;
import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	double base, altura, resp;
		System.out.print("Digite o valor da base: ");
		base = input.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = input.nextDouble();
		resp = base*altura/2;
		System.out.println("Essa é a área dp seu losango: " +resp);
	}

}
