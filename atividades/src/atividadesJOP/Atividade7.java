package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String salFunStr = JOptionPane.showInputDialog("Digite o valor do salário do funcionário: ");
double salFun = Double.parseDouble(salFunStr);
double salMin = 1320;
double qntSalMin = salFun/salMin;
JOptionPane.showInternalMessageDialog(null, "O funcionário recebe " + qntSalMin + " salários mínimos.");
	}

}
