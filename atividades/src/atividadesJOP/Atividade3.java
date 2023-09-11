package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dolarStr = JOptionPane.showInputDialog("Digite sua quantia em dólar: ");
		double dolar=  Double.parseDouble(dolarStr);
		double dolar$ = 4.99;
		double reais= dolar*dolar$;
		JOptionPane.showMessageDialog(null, "Essa é sua quantia em R$; "+reais);
	} 

}
