package patrica10_3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite as horas (0-23): ");
		int hora = input.nextInt();
		System.out.println("Digite os minutos (0-59): ");
		int minuto = input.nextInt();
		System.out.println("Digite os segundos (0-59): ");
		int segundo = input.nextInt();
		Tempo tempo = new Tempo(hora,segundo,minuto);
			System.out.println("São exatamente: "+ tempo);

	}

}
