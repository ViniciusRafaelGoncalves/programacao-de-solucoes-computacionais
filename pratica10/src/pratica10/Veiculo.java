package pratica10;

public class Veiculo {
	private String marca;
	private String modelo;
	private String numeroChassi;
	private String placa;
	private String cor;

	public Veiculo(String marca, String modelo, String numeroChassi, String placa, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroChassi = numeroChassi;
		this.placa = placa;
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String exibe() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nChassi: " + numeroChassi + "\nPlaca: " + placa + "\nCor: "
				+ cor;
	}
}
