package calculadora;

import java.util.Scanner;
public class Calculadora {
public static void main(String args[]){
//Cria Scanner para obter entrada a partir da janela de comando
Scanner input = new Scanner( System.in );
int numero1, numero2, soma;
System.out.print("Informe o 1o numero: ");
numero1 = input.nextInt();
System.out.print("Informe o 2o numero: ");
numero2 = input.nextInt();
soma = numero1 + numero2;
System.out.println("A soma eh: " + soma);
	}

}
