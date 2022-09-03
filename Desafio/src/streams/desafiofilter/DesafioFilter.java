package streams.desafiofilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        /*
        * Criar duas funções LAMBDAS para DOIS filtros diferentes
        *
        *Um filter deve estar dentro do outro
        *
        * E depois usar o map para modificar oque foi filtrado
        *
        * Filtrar carros por COR igual a preta e todos os carro acima de ano 2000
        */

        Carro Ferrari = new Carro("Ferrari",2020,"Preto");
        Carro Fusca = new Carro("Fusca",1999,"Preto");
        Carro Gol = new Carro("Gol",2020,"Branco");
        Carro Parati = new Carro("Parati",2015,"Preto");

        List<Carro> carros = Arrays.asList(Ferrari,Fusca,Gol,Parati);
        Function<Carro, String> dizCorEAnoFabri = carro -> "Parabens, seu carro modelo: "+carro.marca+" e ano: "+carro.anoFabricacao+" e tambem e da cor "+carro.cor;

        Predicate<Carro> filtroAnoFabricacao = carro -> carro.anoFabricacao >= 2015;
        Predicate<Carro> filtroCorCarro = carro -> carro.cor.equalsIgnoreCase("preto");
        carros.stream().filter(filtroAnoFabricacao).filter(filtroCorCarro).map(dizCorEAnoFabri).forEach(System.out::println);


    }
}
