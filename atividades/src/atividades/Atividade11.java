package atividades;
import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero= input.nextInt();
        System.out.println("Tabuada de multiplicação para " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
