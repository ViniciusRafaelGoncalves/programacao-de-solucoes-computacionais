package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cateAStr = JOptionPane.showInputDialog(null, "Digite o cateto (a): ");
String cateBStr = JOptionPane.showInputDialog(null, "Digite o cateto (b): ");
double cateA=Double.parseDouble(cateAStr);
double cateB=Double.parseDouble(cateBStr);
double hip = Math.sqrt(Math.pow(cateA, 2) + Math.pow(cateB, 2));
JOptionPane.showMessageDialog(null, "Esse é o valor da hipotenusa: "+hip);
	}

}
