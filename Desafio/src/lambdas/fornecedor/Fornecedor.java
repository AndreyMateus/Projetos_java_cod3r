package lambdas.fornecedor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        //Suplier == Fornecedor

        //Não recebe nenhum parâmetro e retorna um dado.
        //Quando não se tem nenhum parâmetro é obrigatório colocar os PARÊNTESES
        Supplier<List<String>> umLista = () -> Arrays.asList("Andrey","Bia","Gui","Ana"); //pode-se colocar um GENERICS dentro de OUTRO GENERICS.

        System.out.println(umLista.get());

        //Poderia também passar um tipo mais GENÉRICO, porém quando mais específico for com uma INTERFACE será melhor.
        Supplier<Object> umListaExemploDois = () -> Arrays.asList("Andrey","Bia","Gui","Ana");//Quando não se tem nenhum parâmetro é obrigatório colocar os PARÊNTESES

    }
}
