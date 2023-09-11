package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String salarioStr = JOptionPane.showInputDialog("Digite o salario do funcionario: R$ ");
		double salario = Double.parseDouble(salarioStr);
		double percent = 0.25;
		double aumento = salario * percent;
		double nsalario = salario + aumento;
		JOptionPane.showMessageDialog(null,"Esse é o seu novo salario do funcionario: R$ " + nsalario);
	}

}
