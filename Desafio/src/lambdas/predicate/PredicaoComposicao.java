package lambdas.predicate;

import java.util.function.Predicate;

public class PredicaoComposicao {
    public static void main(String[] args) {

        //o "is" é utilizado para dizer que a variável tem um valor do TIPO BOOLEANO
        Predicate<Integer> isPar = num -> num % 2 == 0;//Predicate retorna um tipo BOOLEANO

        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        //Nesse caso o valor é passado de Ispar para IsTresDigitos e é válidada a expressão "AND".
        System.out.println(isPar.and(isTresDigitos).test(122));// diz se um número é PAR ou ÍMPAR e se possui 3 digitos

        System.out.println(isPar.and(isTresDigitos).negate().test(122));// diz se um número é PAR ou ÍMPAR e se possui 3 digitos E INVERTE/NEGA o VALOR

        System.out.println(isPar.or(isTresDigitos).test(122));//diz se é PAR/IMPAR OU TEM 3 DIGITOS

    }
}
