package oo.composicao.muitos_para_muitos;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Andrey");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Javascript");
        Curso curso3 = new Curso("Php");

        aluno1.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso2);
        aluno3.adicionarCurso(curso3);
        //OU
        curso1.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for(Aluno aluno : curso1.alunos){
            System.out.println("Estou matriculado no curso "+curso3.nome);
            System.out.println("E o meu nome é "+aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);
        Curso cursoEncontrado =aluno1.obterCursoPorNome("Java");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
