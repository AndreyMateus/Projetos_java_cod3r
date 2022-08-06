package colecoes_fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        //criando uma fila
        Queue<String> fila = new LinkedList<>();

        //Tanto ADD quanto OFFER adicionam elementos na fila, a diferença é o comportamento quando a fila está cheia!

        // add - retorna um erro caso não consiga adicionar a uma fila limitada.
        fila.add("Ana");
        // offer - retorna false/exceção caso ele não consiga adicionar a uma fila limitada.
        fila.offer("Bia");
        fila.add("Andrey");
        fila.offer("Carlos");
        fila.add("Gui");
        fila.offer("Daniel");

        //Diferença entre o PEEK e o ELEMENT é o comportamente quando a fila está vazia.
        //Peek e Element - obter o próximo elemento da fila (sem remover)

        // peek - retorna um NULL
        System.out.println(fila.peek());
        System.out.println(fila.peek());

        // element - retorna um erro/exceção
        System.out.println(fila.element());
        System.out.println(fila.element());

        //fila.size();//retorna o tamanho
        //fila.clear();//limpa a fila
        //fila.isEmpty();// diz se a fila está vazia
        //fila.contains(); //verifica se tem o item passando como parâmetro dentro da lista.

        //POll e Remove -> obter o próximo elemento da fila e remove ele.

        //poll - retorna um NULL se a fila estiver vazia.
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //remove - retorna um ERRO se a fila estiver vazia.
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());




    }
}
