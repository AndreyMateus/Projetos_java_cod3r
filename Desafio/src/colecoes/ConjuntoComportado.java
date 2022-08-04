package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //Set é a mesma coisa que HashSet
        Set<String> lista = new HashSet<String>();
        // ou Set<String> lista = new HashSet<>(); é a mesma coisa que o código acima
        SortedSet<String> listaa = new TreeSet<String>();//Já se você usar um TreeSet, ele vai guardar a ordem de inserção dos elementos.
        lista.add("Andrey");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");

        for(String candidato : lista){
            System.out.println(candidato);
        }

    //
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        for(Integer numero : numeros){
            System.out.println(numero);
        }

    }
}
