package pratica_12;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o número de pessoas que deseja cadastrar:");
    int tamanho = input.nextInt();
    Cadastro cadastro = new Cadastro(tamanho);

    for (int i = 0; i < tamanho; i++) {
        System.out.println("Digite o tipo de pessoa (1 para Pessoa Física, 2 para Pessoa Jurídica):");
        int tipo = input.nextInt();
        input.nextLine(); 

        if (tipo == 1) {
            PessoaFisica pessoaFisica = new PessoaFisica();
            System.out.println("Digite o nome:");
            pessoaFisica.setNome(input.nextLine());
            System.out.println("Digite o CPF:");
            pessoaFisica.setCpf(input.nextLine());
            cadastro.cadastrarPessoa(pessoaFisica);
        } else if (tipo == 2) {
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            System.out.println("Digite o nome:");
            pessoaJuridica.setNome(input.nextLine());
            System.out.println("Digite o CNPJ:");
            pessoaJuridica.setCnpj(input.nextLine());
            cadastro.cadastrarPessoa(pessoaJuridica);
        } else {
            System.out.println("Tipo de pessoa inválido. Tente novamente.");
            i--; 
        }
    }

    cadastro.imprimirCadastro();
}
}