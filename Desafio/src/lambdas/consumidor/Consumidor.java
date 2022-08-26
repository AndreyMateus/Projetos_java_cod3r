package lambdas.consumidor;

import lambdas.predicate.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        //O Consumer aceita UM ÚNICO PARÂMETRO e NÃO RETORNA NADA
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome +" !!!");//Aqui estamos terminando a IMPLEMENTAÇÃO do MÉTODO ABSTRATO

        Consumer<String> imprime = parametro -> System.out.println(parametro);
        imprime.accept("Olá");

        Produto p1 = new Produto("Caneta",12.34,0.09);
        // accept é o MÉTODO ABSTRATO da INTERFACE CONSUMER
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Caderno",19.90,0.09);
        Produto p3 = new Produto("Borracha",12.34,0.09);
        Produto p4 = new Produto("Lapis",7.80,0.09);
        Produto p5 = new Produto("Notebook",12.34,0.09);

        List<Produto> produtos = Arrays.asList(p1);
        // o forEach espera sempre receber um CONSUMER, uma função que irá executar passos e não retornará nada.
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }

}
