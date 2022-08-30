package lambdas.unario;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        //O operador unário é muitos Simples e legal para fazer ENCADEAMENTO entre várias CHAMADAS de FUNÇÕES,pois o TIPO de ENTRADA é o TIPO de RETORNO.

        //Ele retorna o mesmo TIPO do parâmetro/GENERICS
        UnaryOperator<Integer> maisDois = num -> num+2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> aoQuadrado = num -> num * num;
        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);

        System.out.println(resultado1);

        //o COMPOSE executa fazendo a mesma coisa, porém de FORMA INVERSA,ELE COMEÇA DO FINAL PARA O INÍCIO
        //antes "DISSO" "FAÇA ISSO"
        //antes do Quadrado faça vezesDois e antes do vezesDois faça o mais Dois
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);

        System.out.println(resultado2);

    }
}
