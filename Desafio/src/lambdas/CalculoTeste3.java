package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // NÂO: int -> Double
        //Sim: double -> Double

        //recebe dois parâmetros e retorna um valor do mesmo tipo DEFINIDO/Generics.
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        //BinaryOperator<Double> calc2 = (x, y) -> x + y;

        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calc2.apply(2, 3));

        BinaryOperator<Double> somar = (a, b) -> a + b;
        BinaryOperator<Double> subtrair = (a, b) -> a - b;
        BinaryOperator<Double> multiplicar = (a, b) -> a * b;
        BinaryOperator<Double> dividir = (a, b) -> a / b;

        //apply é o nome da FUNÇÃO dentro da INTERFACE BinaryOperator
        System.out.println(somar.apply(2.0, 2.0));
        System.out.println(subtrair.apply(2.0, 2.0));
        System.out.println(multiplicar.apply(2.0, 2.0));
        System.out.println(dividir.apply(2.0, 2.0));
    }
}
