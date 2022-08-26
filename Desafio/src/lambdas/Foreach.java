package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class Foreach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana","Bia", "Lia", "Gui");

        System.out.println("Forma Tradicional");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        //o primeiro parâmetro é automaticamente reconhecido como o ITERADOR do LAÇO
        aprovados.forEach( iterador ->  System.out.println(iterador+" !!!") );
        // OU
        //aprovados.forEach( (nome) -> { System.out.println(nome+" !!!");} );


        System.out.println("\nMethod Reference#1...");
        //Esse processo é MENOS FLEXIVEL que usar FUNÇÃO LAMBDA
        aprovados.forEach(System.out::println);//é como se PASSSE o ENDEREÇO de MEMÓRIA DO MÉTODO para o ForEach e ele fizesse essa ligação de pegar o método pelo endereço e já setar ao INDICE que ele estiver percorrer no LAÇO.


        System.out.println("\nLambda #02...");
        aprovados.forEach( nome -> meuImprimir(nome) );

        System.out.println("\nMethod Reference#2...");
        aprovados.forEach( Foreach::meuImprimir );//Apontando para o Endereço de Memória do MÉTODO da CLASSE


    }
    static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome é "+nome);
    }


}
