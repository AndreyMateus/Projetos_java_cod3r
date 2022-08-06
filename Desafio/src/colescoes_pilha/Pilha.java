package colescoes_pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    //PILHA é LIFO - Last in First Out (Último a entrar é o primeiro a sair)
    // o dado mais recente inserido

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        //OU
        //Deque<String> livrosa = new ArrayDeque<String>();

        livros.add("O Pequeno Princípe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());// retorna null se não tiver nenhum elemento no deck
        System.out.println(livros.element());// retorna um erro se não tiver nenhum elemento no deck


        // o POLL, POP e REMOVE fazem a mesma coisa, a diferença é o comportamento quando a Pilha estiver cheia ou vazia.
        System.out.println(livros.poll());//remove o elemento do início ao fim
        System.out.println(livros.pop());//remove o elemento do início ao fim

        System.out.println(livros.remove());//remove o elemento do início ao fim, reto

        //outros métodos
        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();

        //percorrendo a filha com um for each (para cada)
        for(String livro : livros){
            System.out.println(livro);
        }

    }
}
