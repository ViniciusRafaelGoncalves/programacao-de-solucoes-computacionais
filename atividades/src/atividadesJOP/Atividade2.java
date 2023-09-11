package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String niverStr= JOptionPane.showInputDialog("Digite o ano em que você nasceu: ");
		String anoatualStr= JOptionPane.showInputDialog("Digite o ano em que estamos: ");
		double niver=Double.parseDouble(niverStr);
		double anoatual=Double.parseDouble(anoatualStr);
		double idade = (anoatual-niver);
		double ano2050=2050;
		JOptionPane.showMessageDialog(null, "Essa é a sua idade: " +idade);
		JOptionPane.showMessageDialog(null, "Essa é a sua idade em 2050: " +(ano2050 - anoatual + idade));
	}

}
