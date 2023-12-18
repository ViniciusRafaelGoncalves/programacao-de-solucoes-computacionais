package asc;
import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador (dividendo): ");
            int numerador = input.nextInt();

            System.out.print("Digite o denominador (divisor): ");
            int denominador = input.nextInt();

            DivisaoInteiros divisaoInteiros = new DivisaoInteiros();
            int resultado = divisaoInteiros.realizarDivisao(numerador, denominador);

            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero ou dividendo menor que 0: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
