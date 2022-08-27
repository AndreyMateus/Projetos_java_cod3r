package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        //O primeiro Generics é o TIPO Parâmetro, o segundo Generics é o TIPO do RETORNO/SAÍDA da FUNÇÃO.
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(0));

        //O primeiro Generics é o TIPO Parâmetro, o segundo Generics é o TIPO do RETORNO/SAÍDA da FUNÇÃO.
        Function<String, String> oResultadoE = valor -> "O resultado e " + valor;

        //O primeiro Generics é o TIPO Parâmetro, o segundo Generics é o TIPO do RETORNO/SAÍDA da FUNÇÃO.
        Function<String, String> empolgado = frase -> frase + " !!!";

        //andThen é o "E então..."
        //primeiro você monta o corpo de tudo, depois passa o valor que vai entrar nesse corpo que você criou.
        // ENTRA UM VALOR INTEGER E SAI UM VALOR STRING, DAI ESSE VALOR ENTRA NA PRÓXIMA FUNÇÃO E POR DAI EM DIANTE REPETINDO.
        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        Consumer imprimir = imprime -> System.out.println(imprime);
        imprimir.accept(resultadoFinal);


    }
}
