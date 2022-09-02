package streams;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

 public interface Utilitarios {
    public static final Consumer<String> print = System.out::println;

    public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();

    public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";// um CARACTERE concatenado com UMA STRING VAZIA VAI GERAR UMA STRING.

    public  static String grito (String n){
        return n + "!!!";
    }
}
