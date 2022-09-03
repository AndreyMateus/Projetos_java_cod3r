package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        //O FILTER serve para PEGAR/FILTRAR uma SELEÇÃO DE ELEMENTOS que estão DENTRO da STREAM BASEADO em cima UM PREDICADO/PREDICATE -> uma função que recebe UM ELEMENTO COMO PARÂMETRO e RETORNA TRUE/FALSE, sendo TRUE o elemento estará na STREAM RESULTANTE, sendo FALSE o elemento não estará na STREAM resultante.

        //No filter utilizamos uma FUNÇÃO ou LAMBDA para dizer qual TIPO de FILTRO iremos USAR

        Aluno a1 = new Aluno("Andrey", 10);
        Aluno a2 = new Aluno("Ana", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        //Embora também seja possível retornar DUAS condições ou MAIS com o OPERADOR &&, não é muito bom pois teu código irá ficar menos legível, utilize 2 FILTERS e será mais legível.
        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;

        Function<Aluno, String> saudacaoaAprovado = a -> "Parabens " + a.nome + " Pela sua nota " + a.nota;

        alunos.stream().filter(aprovado)
                .map(saudacaoaAprovado)
                .forEach(System.out::println);


    }
}
