package pratica4;

import javax.swing.JOptionPane;

public class Remake3_1 {
	public static void main(String[] args) {
		boolean continuar = true;
		do {
			String dolarStr = JOptionPane.showInputDialog("Digite sua quantia em dólar: ");
			double dolar = Double.parseDouble(dolarStr);
			double dolar$ = 4.99;
			double reais = dolar * dolar$;
			JOptionPane.showMessageDialog(null, "Essa é sua quantia em R$: " + reais);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
			if (resposta != JOptionPane.YES_OPTION) {
				continuar = false;
			}
		} while (continuar);
	}
}