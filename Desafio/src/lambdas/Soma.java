package lambdas;

public class Soma implements Calculo {

    //Método tradicional, não é uma LAMBDA.
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
