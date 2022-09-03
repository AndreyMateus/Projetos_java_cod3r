package streams;

import array.Array;
import lambdas.consumidor.Consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        //STREAM é utilizado para TRATAR um CONJUNTO DE DADOS

        //Temos DOIS tipos de STREAMS
        //ORDENADAS E NÃO ORDENADAS
        //E DENTRO DESSAS CLASSIFICAÇÕES ELAS PODEM SER: PARALELAS E NÃO PARALELAS

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::print;

        //a primeira forma de criar uma STREAM é através do Stream.of(); que é um método estático, por isso mesmo está sendo acessado através da interface.
        //Um método estático é um método da CLASSE/INTERFACE
        Stream<String> langs = Stream.of("Java", "Lua", "JS \n");
        langs.forEach(print);

        //A segunda forma de criar uma STREAM é com um ARRAY
        String[] maisLangs = {"Python", "Lisp", "Perl", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        //A terceira forma de criar uma STREAM é através da CLASSE ARRAYS
        Arrays.stream(maisLangs).forEach(print);

        //Aqui eu crio uma STREAM porém determinando para COMEÇAR a criar A PARTIR DO ELEMENTO de ÍNDICE 1 e indo até o ELEMENTO de ÍNDICE 2, porém ele não incluirá o último elemento, que é o elemento de índice 2 nesse caso.
        //Isso é uma outra forma de pegar um SUB CONJUNTO/SUB ARRAY e transformar isso em uma STREAM.
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        //Uma outra forma é a partir das COLLECTIONS
        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(print);

        //Abrindo uma STREAM com COLLECTIONS na ORDEM PARALELA
        outrasLangs.parallelStream().forEach(print);

        //Uma outra possibilidade de criar de criar uma STREAM é com o MÉTODO GENERATE, o generate vai gerar uma STREAM infinita e que não tem uma ORDEM/ORDENAÇÃO.
        // E para isso você passa dentro do GENERATE um SUPPLIER, SUPPLIER é uma função LAMBDA que não recebe parâmetro e RETORNA alguma coisa.
        Stream.generate(() -> "a").forEach(print);

        //Também há uma outra possibilidade de GERAR uma STRING de FORMA INFINITA com o ITERATE
        //Nesse caso já temos uma ORDENAÇÃO
        //o primeiro parâmetro é o VALOR INICIAL
        //o segundo parâmetro é um OPERADOR UNÁRIO, recebo alguma coisa e retorno alguma coisa.
        Stream.iterate( 0 , n -> n + 1).forEach(println);


    }
}
