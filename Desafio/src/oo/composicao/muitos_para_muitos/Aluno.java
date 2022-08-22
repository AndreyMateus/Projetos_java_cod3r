package oo.composicao.muitos_para_muitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;

    Aluno(String nome) {
        this.nome = nome;
    }

    final List<Curso> cursos = new ArrayList<>();//uma lista FINAL pode ter conteúdos variaveis/alterados, oque não se pode é: alterar o endereço da instância.


    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }


}
