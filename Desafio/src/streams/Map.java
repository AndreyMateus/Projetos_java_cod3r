package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    //um MAP é um comportamento dentro da CLASSE STREAM, então não tem problema criar uma CLASSE com o NOME MAP
    public static void main(String[] args) {
        //Map é uma função que faz um mapeamento de um elemento para outro elemento, de tal forma que a sequência de objetos quer está presente dentro da STREAM que tem determinado tamanho, e o resultado gerado seja outra STREAM gerada também com o mesmo tamanho.
        //O map serve para transformar uma STREAM em outra STREAM, e o método que você passa pra ele ou a lambda expression, é exatamente a função que recebe um elemento, transforma esse elemento e retorna um novo elemento em UMA STREAM de mesmo TAMANHO só que com todos os elementos transformados.

        Consumer<String> print = System.out::println;

        //UnaryOperator<String> maiuscula = n -> n.toUpperCase();

        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";// um CARACTERE concatenado com UMA STRING VAZIA VAI GERAR UMA STRING.

        UnaryOperator<String> grito = n -> n+ "!!!";

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");

        //o stream é uma operação build/inicial, ele pega uma lista e retorna uma lista de objetos
        //map recebe uma function e retorna uma STREAM, pois ele é uma operação intermediária
        //Já o forEach é uma operação terminal, depois dele não há nada para ser feito.

        System.out.println("\n Usando composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);

        //marcas.stream().map(maiuscula.andThen(primeiraLetra).andThen(grito)).forEach(print);

    }
}
