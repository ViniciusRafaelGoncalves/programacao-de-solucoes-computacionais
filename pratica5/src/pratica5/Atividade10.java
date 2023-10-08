package pratica5;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countMulheresEntre20e40 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();
            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            char sexo = input.next().charAt(0);

            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                countMulheresEntre20e40++;
            }
        }
        
        System.out.println("Número de mulheres entre 20 e 40 anos: " + countMulheresEntre20e40);
    }
}