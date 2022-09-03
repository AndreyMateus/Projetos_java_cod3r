package streams.desafiomap;

import lambdas.consumidor.Consumidor;
import streams.Utilitarios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        /*
            1. Número para string binária... 6 => "110" - feito
            2. Inverter a string... "110" => "011" - o primeiro número passa a ser o último - feito
            3.Converter de volta o valor para inteiro => "011" => 3
        */
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Integer.toBinaryString();
        Function<Integer, String> converterToBinaryString = n -> Integer.toBinaryString(n);

        /*
        //Esse meu método estava dando problema, então resolvi substituir pelo do professor, onde ele estava usando um método chamando REVERSE, o faz o código ficar mais simples.
        UnaryOperator<String> firstForLast = string -> {
            int tamanho = string.length();//pegando o comprimento/tamanho da palavra
            String valorInicial = string.substring(0, 1); // pegando a primeira letra
            String valorMeio = string.substring(1, tamanho); // pegando o corpo da string menos a última letra
            String valorFinal = string.substring(tamanho - 1, tamanho);// pegando a última letra
            String completeTradeIndice = valorFinal + valorMeio + valorInicial;// faltando inverte das posições
            return completeTradeIndice;
        };
         */


        Function<String, Integer> converteBinaryStringToDecimalInteger = num -> Integer.parseInt(num,2);// o segundo parâmetro é para indicar qual base o número será convertido, por isso é o número 2, que significa BASE 2, BI-nário.

        UnaryOperator<String>inverter2 = s -> new StringBuilder(s).reverse().toString();

            nums.stream().map(converterToBinaryString).map(inverter2).map(converteBinaryStringToDecimalInteger).forEach(System.out::println);


        /*
            O código abaixo é a resolução feita pelo professor
        */
            UnaryOperator<String>inverter = s -> new StringBuilder(s).reverse().toString();

            Function<String, Integer> binarioParaInt = num -> Integer.parseInt(num,2);//base 2 para ser convertido de binário para Inteiro

            //nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(System.out::println);


    }
}
