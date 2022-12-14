package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        //Match é utilizado para saber se alguma operação aconteceu com determinado elemento
        // allMatch, anyMatch e noneMatch são FUNÇÕES TERMINAIS/TERMINADORAS

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
        Predicate<Aluno> aprovados = aluno -> aluno.nota >= 7;
        Predicate<Aluno> reprovado = aprovados.negate();

        //todos os alunos tiveram nota acima de 7 ? - allMatch
        System.out.println(alunos.stream().allMatch(aprovados));

        //ALGUM aluno teve a nota acima de 7 ? - anyMatch
        System.out.println(alunos.stream().anyMatch(aprovados));

        //Nenhum aluno teve a nota cima de 7? - noneMatch
        System.out.println(alunos.stream().noneMatch(aprovados));

        //Nenhum/Ninguém ficou reprovado/não tem nota < 7?
        System.out.println(alunos.stream().noneMatch(reprovado));

    }
}
