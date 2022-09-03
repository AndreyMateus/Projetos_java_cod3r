package excecao;

public class Basico {
    public static void main(String[] args) {
        /*
              *********IMPORTANTE**********
            Se precisar silenciar uma exce��o, pelo menos LOGUE ela em um arquivo LOG, para que voc� possa consultala depois.
        */

        Aluno a1 = null;

        //Dentro do TRY deve ficar o c�digo que pode gerar algum tipo de problema
        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usu�rio");
        }
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            //tente sempre especificar o erro
            //printStackTrace imprime em que ponto da pilha de exce��o o erro foi lan�ado
            //e.printStackTrace();

            System.out.println("Ocorreu o erro: " + e.getMessage());//getMessage pega a mensagem que � gerada pelo erro, nem todos os erros tem mensagem.
        }


        System.out.println("Fim :)");
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }

}

