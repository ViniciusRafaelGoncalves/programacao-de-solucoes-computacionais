package pratica9_2;

import java.util.Scanner;

public class Main {
	public static void main(String Args[]) {
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a altura do retângulo: ");
		ret.setAltura(input.nextFloat());
		System.out.print("Informe a largura do retângulo: ");
		ret.setLargura(input.nextFloat());
		System.out.println("A area é: " + ret.calculaArea());
		System.out.println("O perimetro é: " + ret.calculaPerimetro());
		System.out.println("Informações do retângulo \n" + ret.exibe());
	}
}