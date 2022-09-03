package excecao.personalizadanaochecada;

import excecao.Aluno;

public class Validar {
    //Construtor privado para que ninguém possa instanciar
    private Validar() {

    }

    //Todas AS EXCEÇÕES ABAIXO SÃO DO TIPO RUNTIME
    public static void usuario(Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("O Aluno está nulo");//se o aluno estiver VAZIO, então lance uma exceção
        }

        //se o nome estiver vazio OU o nome sem OS ESPAÇOS estiver VAZIO, lance uma exceção
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }

        if(aluno.nota < 0 || aluno.nota >10)
        throw new NumeroForaDoIntervaloException("nota");
    }


}
