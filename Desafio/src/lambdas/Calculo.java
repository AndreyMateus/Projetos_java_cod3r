package lambdas;

@FunctionalInterface //deixa explicito que só aceita UMA função.
//Para usar funções LAMBDAS, é necessários que a INTERFACE seja uma INTERFACE FUNCIONAL/ FUNCTIONAL INTERFACE
public interface Calculo {


    double executar(double a, double b);//ÚNICO MÉTODO ABSTRATO
    // OU
    //public abstract double executar(double a, double b);

    //default é uma exceção para criação de outros métodos, porém só o método abstrato poderá ser chamado em uma função lambda.
    /*
    default String legal(double a, double b){
        //OU executar(a,b);
        return "Legal";
    }
    */

    //Um método static também é uma exceção, porém não tem acesso a outros métodos dentro da interface, e muito menos pode ter sequer algum parâmetro.
    /*
    static String muitoLegal(){
        return "Muito legal";
    }
    */

}
