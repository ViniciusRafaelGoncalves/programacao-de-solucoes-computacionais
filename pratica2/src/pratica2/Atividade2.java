package pratica2;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
double lado1,lado2,lado3;
System.out.println("Digite o primeiro lado: ");
lado1=input.nextDouble();
System.out.println("Digite o segundo lado: ");
lado2=input.nextDouble();
System.out.println("Digite o terceiro lado: ");
lado3=input.nextDouble();

if (lado1==lado2&&lado2==lado3)
	{
	System.out.println("Esse é um triângulo equilátero");
	}
else if (lado1==lado2 || lado1==lado3 || lado2==lado3)
	{
		System.out.println("Esse é um triângulo isóceles");
	}
else 
	System.out.println("Esse é um triângulo escaleno");


	}

}
