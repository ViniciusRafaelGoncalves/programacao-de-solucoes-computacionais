package pratica3;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int totalSal = 0;
		int totalFil = 0;
		int totalPessoas = 0;
		while (true) {
			System.out.print("Informe o salário (ou um número negativo para sair): ");
			int salario = input.nextInt();
			if (salario < 0) {
				System.out.print("Encerrado");
				break;
			}
			System.out.print("Informe o total de filhos da família: ");
			int filhos= input.nextInt();	
			totalSal+=salario;
			totalFil+=filhos;
			totalPessoas++;
		}
double medSal = (double)totalSal/totalPessoas;
double medFil = (double)totalFil/totalPessoas;
System.out.println("Média salarial da população: R$ " + medSal);
System.out.println("Média do número de filhos: " + medFil);
	}

}
