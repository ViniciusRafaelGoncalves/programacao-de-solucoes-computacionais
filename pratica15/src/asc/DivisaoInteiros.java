package asc;

public class DivisaoInteiros {

    public int realizarDivisao(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        if (numerador < 0) {
           throw new ArithmeticException("Dividendo menor que 0 não é permitido.");
        }

        return numerador / denominador;
    }
}