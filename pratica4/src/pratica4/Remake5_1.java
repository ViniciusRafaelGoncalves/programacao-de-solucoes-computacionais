package pratica4;

import javax.swing.JOptionPane;

public class Remake5_1 {

	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String baseStr = JOptionPane.showInputDialog("Digite a base do losango: ");
			String alturaStr = JOptionPane.showInputDialog("Digite a altura do losango: ");
			double base = Double.parseDouble(baseStr);
			double altura = Double.parseDouble(alturaStr);
			double area = base * altura / 2;

			JOptionPane.showMessageDialog(null, "Essa é a área do losango: " + area);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}
