package classe;

public class AreaCirc {
    double raio;

    // static é um modificador de acesso - ele permite que o valor da variável fica ASSOCIADO diretamento a CLASSE, e não a instância dela.
    // isso faz com que o valor só seja criado e compartilhado, fazendo com que as instãncias não precisem reservar espaço na memória para o mesmo atributo com valor igual.
    // OU SEJA: Dados com STATIC, podem ser lidos diretamente através da classe.
    // se ALTERAR o valor de UMA STATIC, será alterada para todos.
     static double pi = 3.14;

     //a palavra FINAL significa que você está criando uma constante, e por convenção deve ser colocar o nome de uma constante todo em MAIÚSCULO.
     final static double PI2 = 3.14;

     // Construtor padrão
    AreaCirc(){

    }
    //Construtor personalizado
    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    // Métodos estáticos - STATIC
    static double area(double raio){
        return raio * Math.pow(raio,2);
    }
    double area(){
        return pi * Math.pow(raio,2);
    }

}
