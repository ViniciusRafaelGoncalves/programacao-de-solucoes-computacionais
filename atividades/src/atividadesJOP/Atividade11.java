package atividadesJOP;
import javax.swing.JOptionPane;
public class Atividade11 {
//Essa foi chat gpt puro, n faço ideia de como faz
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valorStr = JOptionPane.showInputDialog("Digite a tabuada desejada: ");
		int valor = Integer.parseInt(valorStr);
		StringBuilder tabuada = new StringBuilder("Tabuada de multiplicação para " + valor + ":\n");	
		for (int i=0; i <=10; i++){
			int resultado = valor * i;
			tabuada.append(valor).append(" x ").append(i).append(" = ").append(resultado).append("\n");
			
			}
		 JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
}


