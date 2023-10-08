package pratica3;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int alunosAprovados = 0;
		int alunosReprovados = 0;
		int totalNotas = 0;
		int contador = 0;
		double maiorNota = Double.MIN_VALUE;
		double menorNota = Double.MAX_VALUE;

		System.out.println("Digite a nota final e o total de faltas dos alunos (Digite uma nota negativa para sair):");

		while (true) {
			System.out.print("Nota final: ");
			double nota = scanner.nextDouble();

			if (nota < 0) {
				break;
			}

			System.out.print("Total de faltas: ");
			int faltas = scanner.nextInt();

			if (nota >= 90 && faltas < 20) {
				alunosAprovados++;
			} else if (nota < 70 || faltas >= 20) {
				alunosReprovados++;
			}

			totalNotas += nota;
			contador++;

			if (nota > maiorNota) {
				maiorNota = nota;
			}

			if (nota < menorNota) {
				menorNota = nota;
			}
		}

		if (contador > 0) {
			double media = (double) totalNotas / contador;
			System.out.println(
					"Quantidade de alunos com nota maior ou igual a 90 e menos de 20 faltas: " + alunosAprovados);
			System.out.println("Quantidade de alunos reprovados por nota ou por falta: " + alunosReprovados);
			System.out.println("Maior nota: " + maiorNota);
			System.out.println("Menor nota: " + menorNota);
			System.out.println("Média de notas da turma: " + media);
		} else {
			System.out.println("Nenhum aluno informado.");
		}

		scanner.close();
	}
}
