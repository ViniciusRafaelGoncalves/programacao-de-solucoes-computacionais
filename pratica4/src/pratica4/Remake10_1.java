package pratica4;
import javax.swing.JOptionPane;
public class Remake10_1 {
    public static void main(String[] args) {
        boolean continuar = true;
        do {
            String raioStr = JOptionPane.showInputDialog("Digite o raio do círculo:");
            double raio = Double.parseDouble(raioStr);
            double comprimento = 2 * Math.PI * raio;
            double area = Math.PI * Math.pow(raio, 2);
            double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

            JOptionPane.showMessageDialog(null, "O comprimento do círculo é: " + comprimento);
            JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
            JOptionPane.showMessageDialog(null, "O volume do círculo é: " + volume);

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?");
            if (resposta != JOptionPane.YES_OPTION) {
                continuar = false;
            }
        } while (continuar);
    }
}


