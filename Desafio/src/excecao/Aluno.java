package excecao;

import java.util.Objects;

public class Aluno {
    //Um Atributo pode ser PÚBLICO desde que seja FINAL e não possa ser alternado.
    public final String nome;
    public final double nota;
    public final boolean bomComportamento;

    public Aluno(String nome, double nota){
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComportamento){
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String toString(){
        return "Tem nota: "+nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
