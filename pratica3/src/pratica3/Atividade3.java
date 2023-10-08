package pratica3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int totalPessoas = 0;
		 int pessoasCanal2 = 0, pessoasCanal4 = 0, pessoasCanal5 = 0, pessoasCanal7 = 0, pessoasCanal12 = 0;
		while (true) {
	
			System.out.print("Informe o número do canal (2,4,5,7,12) e informe o número 0 para encerrar: ");
			int canal = input.nextInt();
			if (canal == 0) {
				System.out.print("Encerrado");
				break;
			}
			System.out.print("Número de pessoas assistindo: ");
			int pessoas = input.nextInt();
			 totalPessoas += pessoas;
	            switch (canal) {
	                case 2:
	                    pessoasCanal2 += pessoas;
	                    break;
	                case 4:
	                    pessoasCanal4 += pessoas;
	                    break;
	                case 5:
	                    pessoasCanal5 += pessoas;
	                    break;
	                case 7:
	                    pessoasCanal7 += pessoas;
	                    break;
	                case 12:
	                    pessoasCanal12 += pessoas;
	                    break;
	                default:
	                    System.out.println("Canal inválido. Tente novamente.");
		}
	            System.out.println("Percentual de audiência de cada canal:");
	            System.out.println("Canal 2: " + ((double) (pessoasCanal2 * 100) / totalPessoas) + "%");
	            System.out.println("Canal 4: " + ((double) (pessoasCanal4 * 100) / totalPessoas) + "%");
	            System.out.println("Canal 5: " + ((double) (pessoasCanal5 * 100) / totalPessoas) + "%");
	            System.out.println("Canal 7: " + ((double) (pessoasCanal7 * 100) / totalPessoas) + "%");
	            System.out.println("Canal 12: " + ((double) (pessoasCanal12 * 100) / totalPessoas) + "%");
	}

}
}