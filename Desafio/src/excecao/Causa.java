package excecao;

import streams.Media;

public class Causa {
    public static void main(String[] args) {
        //UMA EXCEÇÃO PODE GERAR OUTRA
        //OS ERROS PODEM TE RUMA HIERARQUIA/SEQUÊNCIA DE CAUSA

        try {
            metodoA(null);
        }catch (IllegalArgumentException e){
            if(e.getCause() != null){
                System.out.println(e.getCause().getMessage());
            }
        }

    }


    //você pode passar UMA EXCEÇÃO como CAUSA de OUTRA EXCEÇÃO
    static void metodoA(Aluno aluno)  {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno está NULOOOOO");
        }
        System.out.println(aluno.nome);
    }
}
