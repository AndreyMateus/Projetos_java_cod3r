package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes","unchecked"})//SuppressWarnings - faz com que as advertências sejam silenciadas

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        //Uma coleção não aceita tipos primitivos, então ela faz a conversão dos tipos primitivos para os tipos objetos.
        conjunto.add(1.2); // double -> DOuble
        conjunto.add(true); // boolean -> boolean
        conjunto.add("Teste"); // String já é Objeto
        conjunto.add(1); // int -> integer
        conjunto.add('X'); // char -> caractere

        // mostrando quantos elementos a coleção possui dentro de si
        System.out.println("Tamanho é: "+conjunto.size());

        //adicionando elementos dentro da coleção
        conjunto.add("Teste");
        conjunto.add('X');
        System.out.println("Tamanho é: "+conjunto.size());

        //removendo elementos de dentro da coleção 
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('X'));

        System.out.println("Tamanho é: "+conjunto.size());

        //verificando se o conjunto contém o valor passado dentro de si
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(true);

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);// União entre dois conjuntos
        System.out.println(conjunto);

        //aqui ele vai reter/pegar apenas os valores que também estiverem na outra coleção
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        //limpando/zerando/resetando o conjunto
        conjunto.clear();
        System.out.println(conjunto);

    }
}
