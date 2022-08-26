package lambdas.predicate;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        //predicate retorna se um valor é verdadeiro ou falso
        //predicate recebe UM ÚNICO PARÂMETRO

        //o IS na frente do nome da variável é uma convenção para dizer que é um valor BOOLEANO.
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto) >= 750);

        Predicate<Produto> isCaro3 = prod -> {
            double valorTotal =  prod.preco * (1 - prod.desconto);
            return valorTotal >= 750;
        };

        Predicate<Double> isCaro2 = a -> a >= 750; // retorna se a é maior que 750 ou igual.

        System.out.println();

        Produto produto = new Produto("Notebook", 3893.89, 0.15);

        System.out.println(isCaro.test(produto));//test é o nome da função ABSTRATA na qual vamos sobreescrever o CORPO dela com NOSSA função LAMBDA.
    }
}
