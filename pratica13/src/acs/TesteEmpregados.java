package acs;

import javax.swing.JOptionPane;

public class TesteEmpregados {
	public static void main(String[] args) {
		Empregado empregado = cadastrarEmpregado();
		exibirInfo(empregado);

		Cliente cliente = cadastrarCliente();
		exibirInfo(cliente);

		Administrador administrador = cadastrarAdministrador();
		exibirInfo(administrador);

		Operario operario = cadastrarOperario();
		exibirInfo(operario);

		Vendedor vendedor = cadastrarVendedor();
		exibirInfo(vendedor);
	}

	private static Empregado cadastrarEmpregado() {
		String nome = JOptionPane.showInputDialog("Digite o nome do empregado:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do empregado:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do empregado:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do empregado:"));
		int numeroSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção do empregado:"));
		double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base do empregado:"));
		double inss = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de INSS para o empregado:"));

		return new Empregado(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
	}

	private static Cliente cadastrarCliente() {
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cliente:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do cliente:"));
		double credMax = Double.parseDouble(JOptionPane.showInputDialog("Digite o crédito máximo do cliente:"));
		double valorEmDivida = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dívida do cliente:"));

		return new Cliente(nome, idade, altura, peso, credMax, valorEmDivida);
	}

	private static Administrador cadastrarAdministrador() {
		Empregado empregadoBase = cadastrarEmpregado();
		double ajudaDeCusto = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a ajuda de custo do administrador:"));

		return new Administrador(empregadoBase.getNome(), empregadoBase.getIdade(), empregadoBase.getAltura(),
				empregadoBase.getPeso(), empregadoBase.getNumeroSecao(), empregadoBase.getSalarioBase(),
				empregadoBase.getInss(), ajudaDeCusto);
	}

	private static Operario cadastrarOperario() {
		Empregado empregadoBase = cadastrarEmpregado();
		double valorProducao = Double
				.parseDouble(JOptionPane.showInputDialog("Digite o valor de produção do operário:"));
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão do operário:"));

		return new Operario(empregadoBase.getNome(), empregadoBase.getIdade(), empregadoBase.getAltura(),
				empregadoBase.getPeso(), empregadoBase.getNumeroSecao(), empregadoBase.getSalarioBase(),
				empregadoBase.getInss(), valorProducao, comissao);
	}

	private static Vendedor cadastrarVendedor() {
		Empregado empregadoBase = cadastrarEmpregado();
		double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de vendas do vendedor:"));
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão do vendedor:"));

		return new Vendedor(empregadoBase.getNome(), empregadoBase.getIdade(), empregadoBase.getAltura(),
				empregadoBase.getPeso(), empregadoBase.getNumeroSecao(), empregadoBase.getSalarioBase(),
				empregadoBase.getInss(), valorVendas, comissao);
	}

	private static void exibirInfo(Pessoa pessoa) {
		JOptionPane.showMessageDialog(null, pessoa.getInfo(), "Informações", JOptionPane.INFORMATION_MESSAGE);
	}
}