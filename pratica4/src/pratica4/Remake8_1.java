package pratica4;

import javax.swing.JOptionPane;

public class Remake8_1 {

	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String pesoStr = JOptionPane.showInputDialog("Informe seu peso em Kg: ");
			double peso = Double.parseDouble(pesoStr);
			double pesoComMais15 = peso * 1.15;
			double pesoComMenos20 = peso * 0.80;

			JOptionPane.showMessageDialog(null, "Seu peso com mais 15%: " + pesoComMais15 + " Kg");
			JOptionPane.showMessageDialog(null, "Seu peso com menos 20%: " + pesoComMenos20 + " Kg");

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}
