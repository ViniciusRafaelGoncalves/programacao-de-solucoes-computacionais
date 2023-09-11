package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String raioStr = JOptionPane.showInputDialog("Digite o raio do círculo:");
double raio = Double.parseDouble(raioStr);
double comprimento = 2 * Math.PI * raio; 
double area = Math.PI*Math.pow(raio,2);
double volume = (3.0/4.0)*Math.PI*Math.pow(raio, 3);
JOptionPane.showMessageDialog(null, "Esse é o comprimento do círculo: "+comprimento);
JOptionPane.showMessageDialog(null,"Essa é a área do círculo: "+area);
JOptionPane.showMessageDialog(null,"Esse é o volume  do círculo: "+volume);
	}

}
