package atividades;
import java.util.Scanner;
public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	double peso,peso15,peso20,p15,p20;
	System.out.print("Informe seu peso em Kg: ");
		peso=input.nextDouble();
		peso15=peso*0.15;
		p15=peso15+peso;
	System.out.println("Seu peso com mais 15% Kg: " +p15);
		peso20=peso*0.2;
		p20=peso-peso20;
	System.out.print("Seu peso com menos 20% Kg: "+p20);	
	
	}

}
