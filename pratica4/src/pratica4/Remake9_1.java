package pratica4;

import javax.swing.JOptionPane;

public class Remake9_1 {

	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String cateAStr = JOptionPane.showInputDialog(null, "Digite o cateto (a): ");
			String cateBStr = JOptionPane.showInputDialog(null, "Digite o cateto (b): ");
			double cateA = Double.parseDouble(cateAStr);
			double cateB = Double.parseDouble(cateBStr);
			double hipotenusa = Math.sqrt(Math.pow(cateA, 2) + Math.pow(cateB, 2));
			JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}