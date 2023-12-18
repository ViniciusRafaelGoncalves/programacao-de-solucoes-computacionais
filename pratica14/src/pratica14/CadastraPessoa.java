
package pratica14;

import javax.swing.JOptionPane;

public class CadastraPessoa {
    public static void main(String[] args) {
        Pessoa objPessoa;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n1. Pessoa física\n2. Pessoa Jurídica"));

        String nome = JOptionPane.showInputDialog("Digite o nome");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String endereco = JOptionPane.showInputDialog("Digite o endereço");

        if (opcao == 1) {
            PF objPF = new PF();
            objPessoa = objPF;

            String RG = JOptionPane.showInputDialog("Digite o RG");
            String CPF = JOptionPane.showInputDialog("Digite o CPF");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n1. Amigos\n2. Parentes"));

            if (opcao == 1) {
                String blog = JOptionPane.showInputDialog("Digite o blog");
                Amigo objAmigo = new Amigo(nome, telefone, endereco, RG, CPF, blog);
                objPessoa = objAmigo;
            } else if (opcao == 2) {
                String email = JOptionPane.showInputDialog("Digite o e-mail");
                Parente objParente = new Parente(nome, telefone, endereco, RG, CPF, email);
                objPessoa = objParente;
            }
        } else {
            PJ objPJ = new PJ();
            objPessoa = objPJ;

            String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ");
            String IE = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
            objPJ.setCNPJ(CNPJ);
            objPJ.setIE(IE);
        }

        JOptionPane.showMessageDialog(null, objPessoa.toString());
    }
}
