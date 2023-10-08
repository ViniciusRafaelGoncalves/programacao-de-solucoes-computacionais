package pratica2;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double nota1,nota2,nota3,media;
System.out.println("Digite sua primeira nota: ");
nota1 = input.nextDouble();
System.out.println("Digite sua segunda nota: ");
nota2 = input.nextDouble();
System.out.println("Digite sua terceira nota: ");
nota3 = input.nextDouble();
media = (nota1+nota2+nota3)/3;

if (media >=0 && media <3)
	{
	System.out.println("Reprovado");
	}
else if (media >=3 && media <7)
	{
	System.out.println("Exame");
	}
	
else if (media >=7 && media <=10)
	System.out.println("Aprovado");
	}

}
