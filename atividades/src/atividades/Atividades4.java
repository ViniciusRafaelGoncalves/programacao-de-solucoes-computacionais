package atividades;
import java.util.Scanner;
public class Atividades4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);	
	double salario, percent, nsalario, aumento;
		System.out.print("Digite o salario do funcionario: R$ ");
		salario = input.nextDouble();
		percent = 0.25;
		aumento = salario * percent;
		nsalario = salario + aumento;
		System.out.println("Esse é o seu novo salario do funcionario: R$ " + nsalario); 
					
	}

}
