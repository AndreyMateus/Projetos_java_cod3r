package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 10);
        Aluno a6 = new Aluno("Luna", 10);
        Aluno a7 = new Aluno("Gui", 10);
        Aluno a8 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4,a5,a6,a7,a8);

        System.out.println("distinct...");
        //O DISTINCT retira todo conteúdo duplicado, mas ele precisa do Equals e do Hascode.
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        //skip - pula o números de elementos passados
        //limit - limita até quantos elementos eu posso pegar
        alunos.stream().distinct().skip(2).limit(1).forEach(System.out::println);

        //Cuidado ao usar o LIMITE e DEPOIS o SKIP, pois ele irá pegar apenas o número de elementos que foi LIMITADO e depois PULAR o número passado, SE AS FUNÇÕES FOREM EXECUTADAS NESSA ORDEM E O NÚMERO DO SKIP FOR O MESMO DO LIMIT, ELE IRÁ PULAR OS ÚNICOS ELEMENTOS QUE FORAM PEGOS.
        //alunos.stream().distinct().limit(2).skip(1).forEach(System.out::println);

        System.out.println("\ntakeWhile");
        //takeWhile - pegue elementos enquanto acontecer determinada condição.
        alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);


    }
}
