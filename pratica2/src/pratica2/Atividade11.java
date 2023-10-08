package pratica2;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Digite seu tempo de estadia no hotel: ");
int estadia=input.nextInt();
double diaria=500;

double taxa;
if (estadia < 15) {
	taxa = 15;
}else if (estadia == 15){
	taxa = 10;
}else {
	taxa = 5;
}
double total = (estadia*diaria)+(estadia*taxa);
System.out.println("Total a ser pago pelo cliente: R$ " + total);
	}

}
