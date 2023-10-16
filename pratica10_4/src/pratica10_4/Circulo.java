package pratica10_4;

public class Circulo {
	private int x,y;
	private double raio;
	
	public Circulo(int x, int y , double raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	public Circulo() {
		this(0,0,0);
	}
	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	public double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}
	public void moveX(int x1) {
		x += x1;
	}
	public void moveY(int y1) {
		y += y1;
	}
	public void aumentaRaio(double n) {
		raio *= n;
	}
	public String exibe() {
		 return "Centro: (" + x + ", " + y + ")\n" +
	               "Raio: " + raio + "\n" +
	               "Área: " + calculaArea() + "\n" +
	               "Perímetro: " + calculaPerimetro();	}
}
