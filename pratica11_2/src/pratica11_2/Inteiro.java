package pratica11_2;
import java.util.Scanner;

public class Inteiro {
	public int multiplicacao(int a, int b) {
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado += a;
		}
		return resultado;
	}

	public int potencia(int a, int b) {
		int resultado = 1;
		for (int i = 0; i < b; i++) {
			resultado = multiplicacao(resultado, a);
		}
		return resultado;
	}

	public int divisao(int a, int b) {
		int quociente = 0;
		while (a >= b) {
			a = a - b;
			quociente++;
		}
		return quociente;
	}

	public int resto(int a, int b) {
		while (a >= b) {
			a = a - b;
		}
		return a;
	}

	public boolean par(int a) {
		return resto(a, 2) == 0;
	}


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Inteiro inteiro = new Inteiro();

    int opcao;
    do {
        System.out.println("\nMenu:");
        System.out.println("1 – Multiplicação");
        System.out.println("2 – Potência");
        System.out.println("3 – Divisão");
        System.out.println("4 – Par");
        System.out.println("5 – Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                int multiplicando = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int multiplicador = scanner.nextInt();
                int resultadoMultiplicacao = inteiro.multiplicacao(multiplicando, multiplicador);
                System.out.println("Resultado: " + resultadoMultiplicacao);
                break;
            case 2:
                System.out.print("Digite a base: ");
                int base = scanner.nextInt();
                System.out.print("Digite o expoente: ");
                int expoente = scanner.nextInt();
                int resultadoPotencia = inteiro.potencia(base, expoente);
                System.out.println("Resultado: " + resultadoPotencia);
                break;
            case 3:
                System.out.print("Digite o dividendo: ");
                int dividendo = scanner.nextInt();
                System.out.print("Digite o divisor: ");
                int divisor = scanner.nextInt();
                int resultadoDivisao = inteiro.divisao(dividendo, divisor);
                System.out.println("Quociente: " + resultadoDivisao);
                break;
            case 4:
                System.out.print("Digite o número: ");
                int numero = scanner.nextInt();
                boolean ehPar = inteiro.par(numero);
                System.out.println("É par? " + ehPar);
                break;
            case 5:
                System.out.println("Saindo do programa. Até mais!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 5);

    scanner.close();
}
}