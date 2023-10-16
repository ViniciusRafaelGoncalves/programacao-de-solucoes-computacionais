package pratica4;

import javax.swing.JOptionPane;

public class Remake11_1 {

	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String valorStr = JOptionPane.showInputDialog("Digite a tabuada desejada: ");
			int valor = Integer.parseInt(valorStr);
			StringBuilder tabuada = new StringBuilder("Tabuada de multiplicação para " + valor + ":\n");
			for (int i = 0; i <= 10; i++) {
				int resultado = valor * i;
				tabuada.append(valor).append(" x ").append(i).append(" = ").append(resultado).append("\n");
			}
			JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada", JOptionPane.INFORMATION_MESSAGE);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver outra tabuada?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}
