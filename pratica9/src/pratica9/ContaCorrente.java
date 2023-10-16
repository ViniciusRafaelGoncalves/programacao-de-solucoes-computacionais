package pratica9;
/**
* Inicia a classe conta corrente do banco
*
*/
public class ContaCorrente {
	private int numero, agencia;
	private double saldo;
/**
 * Inicia a conta com o número, agência e saldo do cliente
 * 
 * @param n Número da conta
 * @param ag Agência da conta
 */

	public void iniciarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;
	}
/**
 * 
 * Método que realiza o saque na conta
 * 
 * @param valor Quantidade que deseja ser sacada caso for maior que o saldo será dado um erro
 */
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Erro! Saldo insuficiente");
		} else {
			saldo = saldo - valor;
		}
	}
/**
 * 
 * O valor que o cliente deseja depositar no banco
 * 
 * @param valor
 */
	public void depositar(double valor) {
		saldo = saldo + valor;

	}
/**
 * 
 * Informa o saldo restante na conta
 * 
 * @return Saldo da conta
 */
	public double consultarSaldo() {
		return (saldo);
	}
/**
 * 
 * Exibe todos os dados da conta do cliente
 * 
 * @return Mostra todos os dados em for de string no console
 */
	public String exibe() {
		return "Agência: " + agencia + "\nConta: " + numero + "\nSaldo: " + String.format("%.2f", saldo);
	}
}
