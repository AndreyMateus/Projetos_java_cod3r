package colecoes_filas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        //Criando uma lista
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        //ou
        //List<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Andrey");

        lista.add(u1);

        //criando um usuario e já adicionando a lista.
        lista.add( new Usuario("Mateus") );

        //percorrendo a lista e exibindo na tela
        for(Usuario user : lista){
            System.out.println(user.toString());
        }

        //buscando um usuario através do índice na lista
        System.out.println(lista.get(1).nome);

        //formas de retirar um usuario da lista
        lista.remove(1);
        lista.remove(new Usuario("Andrey"));

        //o retorno que ele gera após executar a função
        System.out.println(lista.remove(0));//retorna um objeto
        System.out.println( lista.remove(new Usuario("Andrey")));//retorna um valor boolean

        System.out.println("Tem"+lista.contains(new Usuario("Lia")));



    }
}
