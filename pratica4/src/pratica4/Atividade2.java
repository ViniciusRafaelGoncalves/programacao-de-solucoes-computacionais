package pratica4;

import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
		validarNota();
		validarSalario();
		validarSexo();
		validarIdade();

		JOptionPane.showMessageDialog(null, "Todos os dados são válidos. Programa encerrado.");
	}

	public static void validarNota() {
		double nota;
		do {
			String input = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10): ");
			nota = Double.parseDouble(input);
		} while (nota < 0 || nota > 10);
		JOptionPane.showMessageDialog(null, "Nota válida: " + nota);
	}

	public static void validarSalario() {
		double salario;
		do {
			String input = JOptionPane.showInputDialog("Informe o salário (maior que zero): ");
			salario = Double.parseDouble(input);
		} while (salario <= 0);
		JOptionPane.showMessageDialog(null, "Salário válido: " + salario);
	}

	public static void validarSexo() {
		char sexo;
		do {
			String input = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
			sexo = input.toLowerCase().charAt(0);
		} while (sexo != 'm' && sexo != 'f');
		JOptionPane.showMessageDialog(null, "Sexo válido: " + sexo);
	}

	public static void validarIdade() {
		int idade;
		do {
			String input = JOptionPane.showInputDialog("Informe a idade (entre 0 e 120): ");
			idade = Integer.parseInt(input);
		} while (idade < 0 || idade > 120);
		JOptionPane.showMessageDialog(null, "Idade válida: " + idade);
	}
}