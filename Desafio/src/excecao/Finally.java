package excecao;

import java.util.*;

public class Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println( 7 / entrada.nextInt());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            //o finally SEMPRE  chamado, independente de existir UM ERRO ou NÃO.
            //MESMO se o ERRO FOR TRATADO OU NÃO TRATADO o FINALLY será executado.
            System.out.println("Finally...");
            entrada.close();
        }

        //Podemos também utilizar o TRY e o FINALLY sem ter um CATCH.
//        try{
//            System.out.println( 7 / entrada.nextInt());
//        } finally {
//            System.out.println("Finally...");
//            entrada.close();
//        }


        System.out.println("Fim");
    }
}
