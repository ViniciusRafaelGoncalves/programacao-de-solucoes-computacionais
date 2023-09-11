package atividades;
import java.util.Scanner;
public class Atividades3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double dolar$, dolar, reais;

		dolar$ = 4.99;
		System.out.println("O dólar está valendo R$ " + dolar$);
		
		System.out.println("Informe sua quantia em Dólares: ");
		dolar = input.nextDouble();
		reais = dolar * dolar$;
		
		System.out.println("Essa é sua quantia em Reais: R$" + dolar*dolar$);
	
	}

}
