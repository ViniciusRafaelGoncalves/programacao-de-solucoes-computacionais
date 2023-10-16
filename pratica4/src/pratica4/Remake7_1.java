package pratica4;

import javax.swing.JOptionPane;

public class Remake7_1 {

	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String salFunStr = JOptionPane.showInputDialog("Digite o valor do salário do funcionário: ");
			double salFun = Double.parseDouble(salFunStr);
			double salMin = 1320;
			double qntSalMin = salFun / salMin;
			JOptionPane.showMessageDialog(null, "O funcionário recebe " + qntSalMin + " salários mínimos.");

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}