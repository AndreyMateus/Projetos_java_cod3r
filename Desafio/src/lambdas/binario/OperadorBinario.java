package lambdas.binario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        //O resultado de um operador UNARIO não pode se encadeado em um BINARIO, pois irá receber DOIS PARÂMETROS, já o CONTRÁRIO É POSSÍVEL, pois o BINÁRIO retornará somente UM RESULTADO.

        // Tanto os DOIS PARÂMETROS DE ENTRADA quanto o RETORNO são do mesmo tipo.
        //você PODE colocar TIPO no PARÂMETRO, Mas não é obrigatório, pois o GENERICS já faz isso.
        //BinaryOperator<Double> media = (Double numA, Double numB) -> (numA + numB) / 2;
        BinaryOperator<Double> media = (numA, numB) -> (numA + numB) / 2;
        System.out.println(media.apply(2.2, 4.0));

        //TIPO do <PRIMEIRO PARÂMETRO><TIPO DO SEGUNDO PARÂMETRO> <TIPO DO RETORNO>
        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado " : "Reprovado";
        System.out.println(resultado.apply(6.0, 9.0));

        //OU
        BiFunction<Double, Double, String> resultadoExemplosDois = (n1, n2) ->{
            double resultadoFinal = ((n1 + n2) / 2);
            return  resultadoFinal >= 7 ?"Aprovado " : "Reprovado";
        };

        //Ou se pode fazer DUAS FUNÇÕES separadas, ASSIM a reutilização seria MAIOR.
        //Primeiro usará a função MEDIA pegará o resultado e PASSARÁ PARA ESSA função CONCEITO, ISSO é CHAMADO de COMPOSIÇÃO DE FUNÇÕES
        Function<Double,String> conceito = m-> m >= 7 ?"Aprovado": "Reprovado";
        System.out.println(media.andThen(conceito).apply(4.0,4.0));
    }
}
