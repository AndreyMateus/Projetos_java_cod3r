package dificuldade_poo_composicao.difi_poo_muitos_para_muitos.muitos_for_muitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;

    final List<Curso> cursos = new ArrayList<>(); // o final não permite que eu sobreescreva o meu arraylist, e não modifique o endereço de memória dele, assim o curso será uma constante, mas seus elementos ainda poderão ser alterados.

    Aluno(String nome){
        this.nome  = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString(){
        return this.nome;
    }


    Curso obterCursoPorNome(String nome){
        for(Curso curso : this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }
}
