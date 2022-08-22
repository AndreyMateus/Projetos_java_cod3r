package dificuldade_poo_composicao.difi_poo_muitos_para_muitos.muitos_for_muitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }
    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }



}
