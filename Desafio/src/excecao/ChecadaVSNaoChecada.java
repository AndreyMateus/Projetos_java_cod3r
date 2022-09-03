package excecao;

public class ChecadaVSNaoChecada {
    public static void main(String[] args) {
        //você pode instânciar um erro/Exception, Mas para usá-lo ele precisa ser LANÇADO.

        /*
        *O erro é lançado em algo que não pode ser recuperado, por isso ele é mais sério.
        Um exemplo de erro é o OutOfMemory, sua aplicação ficar sem disponibilidade de memória e ela fechar/parar de responder  ali mesmo.
        Já uma Exceção é uma exceção A REGRA.
        Exception são situações que se é possível tratar o error e fazer algum tipo de ação para evitar.
        */

        try {
            geraErro1();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        geraErro2();

        try{
            geraErro22();
        }catch (Throwable e){
            //THROWABLE é mais GENÉRICO que EXCEPTION, Até mesmo PORQUE É A CLASSE PAI DA EXCEPTION.
            //THROWABLE TRATA QUALQUER ERRO de EXECUÇÃO
            System.out.println(e.getMessage());
        }



        System.out.println("Fim ;)");
    }

    //aqui temos uma EXCEÇÃO NÃO CHECADA
    //Uma Exceção não checada ou não verificada, é uma exceção que o COMPILADOR te DEIXA escolher se você quer TRATAR ou NÃO TRATAR o ERRO.
    static void geraErro1() {
        //você pode instânciar um erro/Exception, Mas para usá-lo ele precisa ser LANÇADO.
        //throw  significa LANÇAR, LANÇAR ERRO.
        //Tudo que é derivado da clase pai THROWABLE pode ser LANÇADO.
        // ser LANÇADO significa que você está jogando algo que vai QUEBRAR o FLUXO da sua APLICAÇÃO e VOLTAR para quem chamou.
       throw new RuntimeException("Ocorreu um erro bem legal #01");//TODA CLASSE que TERMINA com EXCEPTION no nome, é filha da EXCEPTION, ou seja: ela HERDA de EXPECTION.
    }

    //Já aqui temos uma EXCEÇÃO CHECADA
    //Uma EXCEÇÃO CHECADA É TRAVA SEU CÓDIGO PARA NÃO SER COMPILADO.
    //Quando se tem uma EXCEÇÃO CHECADA, você é OBRIGADO a COLOCAR na ASSINATURA DO MÉTODO que você lança esse tipo de EXCEÇÃO.
    //usando o THROWS na ASSINATURA você deixa CLARO que aquela EXCEÇÃO é CHECADA/VERIFICADA.
    //Você pode TRATAR a EXCEÇÃO OU LANÇAR PARA OUTRO MÉTODO TRATAR.
    //O NOME DEPOIS do throws esseNome, é o nome o TIPO de ERRO.
    //o THROWS é tipo a frase -> "Ó SÁ POHA AI TÁ LANÇANDO UM ERRO, SE VIRA COM ELE DEPOIS"
    static void geraErro22() throws Exception {
            throw new Exception("Ocorreu um erro bem legal #02");
    }
    static void geraErro2() {
        //Você também pode LANÇAR uma EXCEÇÃO e já tratar ela dentro do próprio ESCOPO.
        //Se você TRATAR a EXCEÇÃO DECLARADA dentro do ESCOPO, não é necessário EXPLICITAR ela com o THROWS.
        try {
            throw new Exception("Ocorreu um erro bem legal #02");
        }catch (Exception e){
            System.out.println("que legal!");
        }
    }


}
