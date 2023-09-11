package atividades;
import java.util.Scanner;
public class Atividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner ( System.in );
		
		System.out.println("Informe o 1 º número: ");
	double Número_1 = input.nextDouble();
		System.out.println("Informe o 2 º número: ");
	double	Número_2 = input.nextDouble();
		System.out.println("Informe o 3 º número: ");
	double	Número_3 = input.nextDouble();
double resp = (Número_1 + Número_2 + Número_3)/3;
System.out.println("A média das notas é: " + resp);
	}

}
