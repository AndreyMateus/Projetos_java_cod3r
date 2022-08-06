package colecoes_map;

import java.util.HashMap;
import java.util.*;

public class Mapa {

    public static void main(String[] args) {

            Map<Integer, String> usuarios = new HashMap<>();
            //OU
            //Map<Integer, String> usuarios = new HashMap<Integer, String>();

            //Método PUT tanto adiciona, mas também SOBREESCREVER o valor.
            usuarios.put(1,"Roberto");
            usuarios.put(3,"Andrey");
            usuarios.put(20,"Andre");
            usuarios.put(4,"Alek");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Andrey"));

        System.out.println(usuarios.get(3));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4,"Alek"));


        //Pode-se percorrer um elemento MAP de três formas, pela chave, pelo valor, e utilizando a chave e o valor ao mesmo tempo.

        //percorrendo e mostrando chave
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        //percorrendo e mostrando valor
        for(String valor : usuarios.values()){
            System.out.println(valor);
        }

        //percorrendo e mostrando  chave e valor
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() +" ===> ");
            System.out.println(registro.getValue());
        }

    }
}
