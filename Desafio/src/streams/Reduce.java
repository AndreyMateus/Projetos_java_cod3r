package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Reduce {
    public static void main(String[] args) {
        //o objetivo é somar todos os elemento usando o REDUCE
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, valorAtual) -> acumulador + valorAtual;

        //Diferente do MAP e do FILTER que são funções intermediárias, o REDUCE é uma função TERMINAL igual o FOREACH, ou seja depois do REDUCE não tem como encadear mais uma função, o RESULTADO final do REDUCE não é UMA STREAM.
        int total1 = nums.stream().reduce(soma).get(); // o get é para retornar o valor do reduce
        System.out.println(total1);

        //se o reduce já tiver um CONTADOR, não é necessário usar o get para retornar, pois o próprio tipo passado como contador será retornado.
        //contador é o primeiro parâmetro dentro do reduce
        //Nesse caso como estamos executando um parallelStream() o reduce será aplicado aos elementos individualmente e depois será somado, então se eu passar o contador como 100, todos terão SEU PRÓPRIO 100 somado e depois juntado, e o valor será 945, e não 145, porém se executar uma stream normal, somaremos tudo e depois somaremos o resultado ao 100, e isso dará 145.
        Integer total2 = nums.parallelStream().reduce(100, soma);
        System.out.println(total2);
        //OU
        //Integer total2 = nums.parallelStream().reduce(0, soma);
        //OU
        //Integer total2 = nums.stream().reduce(100, soma);

        //Resultado foi um Opcional<Integer>...
        //quando se tem um Opcional você tem que chamar o GET
        //Porém quando se é um Opcional ele tem algumas funcões como o ifPresente e não é necessário chamar o get caso você chame outra função.
        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);

    }
}
