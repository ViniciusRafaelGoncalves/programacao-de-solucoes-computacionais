package pratica8;
import java.util.Scanner;
public class Atividade2 {

	   public static void main(String[] args) {
	        double total = somarPrecos();
	        System.out.println("O total dos preços dos produtos é: " + total);
	    }

	    public static double somarPrecos() {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Quantos preços você deseja somar? ");
	        int quantidade = input.nextInt();

	        double total = 0;
	        for (int i = 0; i < quantidade; i++) {
	            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
	            double preco = input.nextDouble();
	            total += preco;
	        }

	        return total;
	    }
	}