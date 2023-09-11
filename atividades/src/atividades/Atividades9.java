package atividades;
import java.util.Scanner;
public class Atividades9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor do cateto 'A': ");
		double catA = input.nextDouble();
		System.out.print("Digite o valor do cateto 'B': ");
		double catB = input.nextDouble();
		double hipotenusa = Math.sqrt(Math.pow(catA, 2) + Math.pow(catB, 2));
		System.out.println("O valor da hipotenusa é: " + hipotenusa);
	}

}
