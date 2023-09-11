package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String celsiusStr = JOptionPane.showInputDialog("Digite um valor em C°: ");
double celsius = Double.parseDouble(celsiusStr);
double faren = celsius*1.8+32;
JOptionPane.showMessageDialog(null, "Esse é o valor em F°: " +faren);
	}

}
