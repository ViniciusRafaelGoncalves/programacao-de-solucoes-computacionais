package pratica5;
import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int maiorN = Integer.MIN_VALUE;
		int menorN = Integer.MAX_VALUE;
		int tN=10;
		for(int i = 1; i<=tN;i++) {
			System.out.print("Digite um número: ");
			int num = input.nextInt();
			if (num<menorN) {
				menorN=num;
			}if (num>maiorN) {
				maiorN=num;
			}
		}
		System.out.print("Esse é o maior número: "+ maiorN+"\n");
		System.out.print("Esse é o menor número: "+ menorN);
		input.close();
	}

}
