package pratica9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ContaCorrente contaCorrente = new ContaCorrente();
		System.out.println("Digite o número da conta: ");
		int numeroConta = input.nextInt();
		System.out.println("Digite o número da agencia: ");
		int numeroAgencia = input.nextInt();
		contaCorrente.iniciarContaCorrente(numeroConta,numeroAgencia);
		System.out.println("Digite o valor do depósito: ");
		double valorDeposito = input.nextDouble();
		contaCorrente.depositar(valorDeposito);
		System.out.println("Dados da conta:\n" + contaCorrente.exibe());
		System.out.println("Digite a quantidade que deseja sacar: ");
		double saldoSacar = input.nextDouble();
		contaCorrente.sacar(saldoSacar);
		System.out.println("Saldo: " + contaCorrente.consultarSaldo());	
		System.out.println("Dados da conta atualizados:\n" + contaCorrente.exibe());
	}
	
}
