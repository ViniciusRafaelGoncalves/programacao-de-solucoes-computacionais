package atividades;
import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	double salarioMinimo, salFun, qntSalariosMinimos;
	 salarioMinimo = 1320;
	System.out.print("Digite o valor do salário do funcionário: ");
     salFun = input.nextDouble();
     qntSalariosMinimos = salFun / salarioMinimo;  
    System.out.println("O funcionário recebe " + qntSalariosMinimos + " salários mínimos.");
	}

}
