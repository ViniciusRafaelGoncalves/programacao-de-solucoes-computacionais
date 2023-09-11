package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String baseStr = JOptionPane.showInputDialog("Digite a base do losango: ");
String alturaStr = JOptionPane.showInputDialog("Digite a altura do losango: ");
double base = Double.parseDouble(baseStr);
double altura = Double.parseDouble(alturaStr);
double area = base*altura/2;

JOptionPane.showMessageDialog(null, "Essa é a área do losango: "+area);

	}

}
