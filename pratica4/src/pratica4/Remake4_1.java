package pratica4;

import javax.swing.JOptionPane;

public class Remake4_1 {

	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String salarioStr = JOptionPane.showInputDialog("Digite o salário do funcionário: R$ ");
			double salario = Double.parseDouble(salarioStr);
			double percent = 0.25;
			double aumento = salario * percent;
			double novoSalario = salario + aumento;
			JOptionPane.showMessageDialog(null, "Esse é o novo salário do funcionário: R$ " + novoSalario);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}