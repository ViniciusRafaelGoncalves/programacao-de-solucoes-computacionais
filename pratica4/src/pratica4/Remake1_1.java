package pratica4;

import javax.swing.JOptionPane;

public class Remake1_1 {

	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota: ");
			String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota: ");
			String nota3Str = JOptionPane.showInputDialog("Digite a terceira nota: ");

			double nota1 = Double.parseDouble(nota1Str);
			double nota2 = Double.parseDouble(nota2Str);
			double nota3 = Double.parseDouble(nota3Str);

			double media = (nota1 + nota2 + nota3) / 3;

			JOptionPane.showMessageDialog(null, "Essa é média das notas: " + media);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}