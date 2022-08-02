package igualdade_objetos;

import java.util.Date;

public class Equals {
    
    public static void main(String[] args) {
        
        Usuario  u1 = new Usuario();
        u1.nome = "Andrey Mateus";
        u1.email = "andrey.mateus@gmail.com";

        Usuario  u2 = new Usuario();
        u2.nome = "Andrey Mateus";
        u2.email = "andrey.mateus@gmail.com";


        //
        System.out.println(u1 == u2);
        //
        System.out.println(u1.nome.equals(u2.nome));
        //
        System.out.println(u2.equals(u1));
        //
        System.out.println(u2.equals(new Date()));


        // o hascode será abordado em outra aula

    }
}
