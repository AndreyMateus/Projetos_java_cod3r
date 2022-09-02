package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    //um MAP é um comportamento dentro da CLASSE STREAM, então não tem problema criar uma CLASSE com o NOME MAP
    public static void main(String[] args) {

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
