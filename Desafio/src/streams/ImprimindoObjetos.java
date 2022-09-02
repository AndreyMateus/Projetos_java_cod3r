package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu","Gui", "Luca", "Ana");

        //forma Tradicional - procedural
        for(int i = 0; i< aprovados.size(); i++){
            System.out.println(aprovados.get(i));
        }

        System.out.println("Usando o forEach");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");

        //Iterador é uma INTERFACE do JAVA que tem DOIS MÉTODOS e retorna TRUE or FALSE
        Iterator<String> iterator  = aprovados.iterator();

        //hasNext - tem próximo ? / se houver um próximo
        while(iterator.hasNext()){
            System.out.println(iterator.next());//next - me dê a próxima string
        }

        //Uma stream também é um conjunto de objetos, a diferença é que a ITERAÇÃO ocorre de forma INTERNA
        System.out.println("\n Usando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);// Laço interno




    }
}
