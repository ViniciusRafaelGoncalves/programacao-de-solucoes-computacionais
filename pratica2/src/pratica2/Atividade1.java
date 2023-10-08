package pratica2;
import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Digite sua primeira nota: ");
		double nota1 = input.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = input.nextDouble();
		double media = (nota1+nota2)/2;
			if (media >= 7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");}
	}

}
