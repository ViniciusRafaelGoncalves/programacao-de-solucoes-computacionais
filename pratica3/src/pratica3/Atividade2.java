package pratica3;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Informe a matrícula do aluno (ou um número negativo para sair): ");
			int matricula = input.nextInt();
			if (matricula < 0) {
				System.out.print("Encerrado");
				break;
			}
			System.out.print("Informe a primeira nota do aluno: ");
			double nota1 = input.nextDouble();
			System.out.print("Informe a segunda nota do aluno: ");
			double nota2 = input.nextDouble();
			System.out.print("Informe a terceira nota do aluno: ");
			double nota3 = input.nextDouble();
			double media = (nota1 + nota2 + nota3) / 3;
			if (media >= 70) {
				System.out.print("Aprovado\n" + media);
			} else if (media >= 60 && media < 70) {
				System.out.print("Recuperação\n" + media);
			} else {
				System.out.print("Reprovado\n" + media + "\n");
			}

		}
	}

}
