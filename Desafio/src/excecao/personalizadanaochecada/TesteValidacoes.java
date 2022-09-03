package excecao.personalizadanaochecada;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno(" Ana ", 7);
            Validar.usuario(aluno);

            Validar.usuario(null);
        } catch (StringVaziaException | NumeroForaDoIntervaloException | IllegalArgumentException s) {
            // a funcionalidade de usar UM PIPE "|" e usar o catch para DUAS ou MAIS exceções surgiu A PARTIR do JAVA 7 ou 8.
            //Mas eu posso simplesmente colocar OUTRO CATCH, ainda mais se eu TIVER TRATAMENTOS DIFERENTES.
            System.out.println(s.getMessage());
        }//catch(NumeroForaDoIntervaloException n){
//            System.out.println(n.getMessage());
//        }
        System.out.println("Fim :)");
    }
}
