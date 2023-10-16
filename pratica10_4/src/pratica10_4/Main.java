package pratica10_4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite a coordenada x: ");
	int x = input.nextInt();
	System.out.println("Digite a coordenada y: ");
	int y = input.nextInt();
	System.out.println("Digite o raio do círculo: ");
	double raio = input.nextDouble();
	
	Circulo circulo=new Circulo(x, y, raio);
			 int opcao;
    do {
        System.out.println("\nMenu:");
        System.out.println("1 - Mover");
        System.out.println("2 - Aumentar");
        System.out.println("3 - Imprimir");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para mover horizontalmente: ");
                int movimentoX = input.nextInt();
                circulo.moveX(movimentoX);

                System.out.print("Digite o valor para mover verticalmente: ");
                int movimentoY = input.nextInt();
                circulo.moveY(movimentoY);
                break;
            case 2:
                System.out.print("Digite o fator de aumento do raio: ");
                double fatorAumento = input.nextDouble();
                circulo.aumentaRaio(fatorAumento);
                break;
            case 3:
                System.out.println(circulo.exibe());
                break;
            case 4:
                System.out.println("Fechando programa.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 4);

    input.close();
}
}