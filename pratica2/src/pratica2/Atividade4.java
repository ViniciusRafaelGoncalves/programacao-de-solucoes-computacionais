package pratica2;
import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.print("Digite seu peso: ");
double peso = input.nextDouble();
System.out.print("Digite sua altura: ");
double altura = input.nextDouble();
double imc = peso/(altura*altura);
String situacaoPeso;

if (imc < 20) {
    situacaoPeso = "Abaixo do Peso";
} else if (imc >= 20 && imc < 25) {
    situacaoPeso = "Normal";
} else if (imc >= 25 && imc < 30) {
    situacaoPeso = "Sobrepeso";
} else if (imc >= 30 && imc <= 40) {
    situacaoPeso = "Obesidade";
} else if (imc >40) {
	situacaoPeso = "Obesidade Mórbida";
} else {
    situacaoPeso = "Fora dos intervalos padrão";
}

System.out.println("O IMC é: " + imc);
System.out.println("Situação de peso: " + situacaoPeso);
	}
	

}