package pratica2;

public class Atividade5 {

    public static double calcularFx(double x) {
        double resultado;

        if (x < -2) {
            resultado = 2 * x + 2;
        } else if (x >= -2 && x < 3) {
            resultado = 3;
        } else {
            resultado = -x;
        }

        return resultado;
    }

    public static void main(String[] args) {
        double x = 4.5; // Substitua este valor por qualquer outro valor de entrada

        double resultado = calcularFx(x);
        System.out.println("f(" + x + ") = " + resultado);
    }
}