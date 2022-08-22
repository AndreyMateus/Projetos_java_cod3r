package oo.composicao.muitos_para_muitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
   final String nome;
    Curso(String nome){
        this.nome = nome;
    }
    final List<Aluno> alunos = new ArrayList<>();//uma lista FINAL pode ter conteúdos variaveis/alterados, oque não se pode é: alterar o endereço da instância.

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);//relacionamento bidirecional
    }

}


