package pratica9_2;

/**
 * Criação da classe retângulo
 * 
 */
public class Retangulo {
	private float altura, largura;

	/**
	 * Criando o método retângulo e dando os valores 0 para a altura e largura para
	 * evitar erros no resultado
	 * 
	 */
	public Retangulo() {
		altura = 0;
		largura = 0;
	}

	/**
	 * 
	 * Recebe a largura do retângulo
	 * 
	 * @return Altura do retângulo
	 */
	public float getAltura() {
		return (altura);
	}

	/**
	 * 
	 * Armazena a altura do retângulo
	 * 
	 * @param alt Altura do retângulo
	 */

	public void setAltura(float alt) {
		altura = alt;
	}

	/**
	 * 
	 * Recebe a largura do retângulo
	 * 
	 * @return Largura do retângulo
	 */
	public float getLargura() {
		return (largura);
	}

	/**
	 * 
	 * Armazena a largura do retângulo
	 * 
	 * @param alt Largura do retângulo
	 */
	public void setLargura(float larg) {
		largura = larg;
	}
/**
 * 
 * Calcula a área do retângulo
 * 
 * @return Define a área do retângulo
 */
	public float calculaArea() {
		return altura * largura;
	}
	/**
	 * 
	 * Calcula o perímetro do retângulo
	 * 
	 * @return Define o perímetro do retângulo
	 */
	public float calculaPerimetro() {
		return 2 * altura + 2 * largura;
	}
/**
 * 
 * Exibe as informações na tela
 * 
 * @return Cria o texto personalizado formatando os métodos em string
 */
	public String exibe() {
		return "Altura: " + String.format("%.2f", altura) + "\nLargura: " + String.format("%.2f", largura) + "\nÁrea: "
				+ String.format("%.2f", calculaArea()) + "\nPerímetro: " + String.format("%.2f", calculaPerimetro());
	}
}