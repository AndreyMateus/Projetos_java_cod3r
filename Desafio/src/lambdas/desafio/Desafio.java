package lambdas.desafio;

import lambdas.predicate.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        /*
           1. A partir produto calcular o preco real (com desconto) - feito
           2. Imposto Municipal: >= 2500 (8,5% - imposto) / < 2500 (Isento) - feito
           3. Frete: >= 3000 preço (100 - valor frete)/ < 3000 preço (50 -valor frete) - feito
           4. Arredondar: Deixar duas casas decimais - até aqui o valor é DOUBLE - feito
           5. Formatar: R$ + 1234,56. - feito
        */
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        ;//Imposto Municipal

        UnaryOperator<Double> frete = produto -> produto >= 3000 ? produto + 100 : produto + 50;//Frete

        Function<Double,String> arredondarFormat = valor -> String.format("%.2f", valor) ;//Arredondar e limitação de casas após a vírgula
        //UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));//Arredondar

        UnaryOperator<String> formatar = valor -> ("R$ " + valor).replace(".", ",");//Formatar
        //Function<Double, String> formatar = valor -> ("R$ " + valor).replace(".", ",");//Formatar


        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String valorTotal = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondarFormat).andThen(formatar).apply(p);

        System.out.println("O preço final é: " + valorTotal);

    }
}
