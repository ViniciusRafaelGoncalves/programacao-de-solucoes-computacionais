package pratica11;

public class Produto {
	private int id;
	private static int ultimo_id = 1;
	private String nome;
	private double preço;

	public Produto() {
		this.id = ultimo_id;
		ultimo_id++;
		this.nome = "Nome não informado";
		this.preço = 0;
	}

	public Produto(String nome, double preço) {
		this();
		this.nome = nome;
		setPreço(preço);
	}

	public static int getUltimo_id() {
		return ultimo_id - 1;
	}

	public static void setUltimo_id(int ultimo_id) {
		Produto.ultimo_id = ultimo_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		if (preço >= 0) {
			this.preço = preço;
		} else {
			this.preço = 0;
		}
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getId() {
		return id;
	}

	public void exibe() {
		System.out.println("Produto: " + nome);
		System.out.println("Id: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Preço: R$ " + preço);
	}

	public void reajustaPreço(double percentual) {
		preço += preço * percentual / 100;
	}
}
