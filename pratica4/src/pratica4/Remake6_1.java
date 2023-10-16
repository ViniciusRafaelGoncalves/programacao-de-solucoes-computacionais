package pratica4;

import javax.swing.JOptionPane;

public class Remake6_1 {
	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String celsiusStr = JOptionPane.showInputDialog("Digite um valor em °C: ");
			double celsius = Double.parseDouble(celsiusStr);
			double faren = celsius * 1.8 + 32;
			JOptionPane.showMessageDialog(null, "Esse é o valor em °F: " + faren);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}