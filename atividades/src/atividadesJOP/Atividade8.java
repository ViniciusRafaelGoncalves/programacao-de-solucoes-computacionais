package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Essa eu vou fazer diferente da Scanner pq meu mano do grupo me deu uma ideia boa :D
String pesoStr = JOptionPane.showInputDialog("Informe seu peso em Kg: ");
double peso = Double.parseDouble(pesoStr);
double peso15 = peso * 1.15;
double peso20 = peso*0.80;
JOptionPane.showMessageDialog(null, ("Seu peso com mais 15% Kg: "+peso15));
JOptionPane.showMessageDialog(null, ("Seu peso com menos 20% Kg: "+peso20));
	}

}
