package pratica10;

public class Cadastro {
	private Veiculo[] veiculos;
	private int contador;

	public Cadastro(int tamanho) {
		veiculos = new Veiculo[tamanho];
		contador = 0;
	}

	public void cadastrarVeiculos(Veiculo veiculo) {
		if (contador < veiculos.length) {
			veiculos[contador] = veiculo;
			contador++;
		} else {
			System.out.println("Erro: Não é possível cadastrar mais veículos!!");
		}
	}

	public void imprimirCadastro() {
		for (int i = 0; i < contador; i++) {
			System.out.println("Veículo " + (i + 1) + ":");
			System.out.println(veiculos[i].exibe() + "\n");
		}
	}
}