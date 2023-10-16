package pratica10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cadastro cadastro = new Cadastro(10);
		boolean cadastrarOutro = true;
		while (cadastrarOutro) {
			System.out.println("Cadastro de Veículo\n");

			System.out.print("Marca: ");
			String marca = input.next();

			System.out.print("Modelo: ");
			String modelo = input.next();

			System.out.print("Número do Chassi: ");
			String numeroChassi = input.next();

			System.out.print("Placa: ");
			String placa = input.next();

			System.out.print("Cor: ");
			String cor = input.next();

			Veiculo veiculo = new Veiculo(marca, modelo, numeroChassi, placa, cor);
			cadastro.cadastrarVeiculos(veiculo);

			System.out.print("Deseja cadastrar outro veículo? (S/N): ");
			String resposta = input.next();
			if (!resposta.equalsIgnoreCase("S")) {
				cadastrarOutro = false;
			}
		}
		cadastro.imprimirCadastro();

	}

}
