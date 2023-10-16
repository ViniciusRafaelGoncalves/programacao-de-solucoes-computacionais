package pratica4;
import java.util.Scanner;

public class Remake9_2 {

	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        char continuar;

	        do {
	            System.out.print("1-Mercúrio\n2-Vênus\n3-Terra\n4-Marte\n5-Júpter\n6-Saturno\n7-Urano\n8-Netuno\n9-Plutão\n");
	            System.out.print("Informe o planeta: ");
	            int planeta = input.nextInt();

	            double gravity = 0.0;
	            switch (planeta) {
	                case 1:
	                    gravity = 3.7;
	                    break;
	                case 2:
	                    gravity = 8.8;
	                    break;
	                case 3:
	                    gravity = 9.8;
	                    break;
	                case 4:
	                    gravity = 3.8;
	                    break;
	                case 5:
	                    gravity = 26.4;
	                    break;
	                case 6:
	                    gravity = 11.5;
	                    break;
	                case 7:
	                    gravity = 9.3;
	                    break;
	                case 8:
	                    gravity = 12.2;
	                    break;
	                case 9:
	                    gravity = 0.6;
	                    break;
	                default:
	                    System.out.println("Código inválido.");
	                    break;
	            }

	            System.out.print("Digite a velocidade: ");
	            double vel = input.nextDouble();

	            System.out.print("Digite um instante: ");
	            double inst = input.nextDouble();
	            double vt = vel - gravity;
	            double ht = vel * inst - (gravity * gravity) / 2;

	            System.out.println("Velocidade: " + vt + "\nLançamento: " + ht);

	            System.out.println("Deseja calcular para outro planeta? (S para Sim, qualquer outra tecla para sair)");
	            continuar = input.next().charAt(0);

	        } while (continuar == 'S' || continuar == 's');
	    }
	}
