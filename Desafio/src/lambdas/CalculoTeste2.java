package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        //Forma com funções lambdas
        //Funções LAMBDAS são do paradigma de programação FUNCIONAL.
        //Função anônima - expressão lambda
        //Com esse tipo de função, não é necessário criar uma Classe e definir  a estrutura para depois intanciar, basta apenas colocar o TIPO da interface, o NOME da variável e a FUNÇÃO.

        //A estrutura e os tipos precisam ser iguais a da interface, o retorno também.
        Calculo calc = (x, y) -> {return x + y;};
        //Calculo nomevar = (x,a) ->  x+a ;
        System.out.println(calc.executar(2, 4));

        //Quando se omite o PAR de CHAVES o java entende que será apenas "UMA" sentença de código e então o RETURN ocorre de forma automática e implicita.
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2,3));

        //Quando for implementar o método, ele identifica de FORMA IMPLICITA, por causa da QUANTIDADE de parâmetros;
        Calculo somar = (a,b) -> a+b;
        Calculo dividir = (a,b) -> a/b;
        Calculo multiplicar = (a,b) -> a*b;
        Calculo subtrair = (a,b) -> a-b;
        //PORÉM, quando for USAR o método, TERÁ que EXPLICITAR.
        System.out.println(somar.executar(2,2));
        System.out.println(dividir.executar(2,2));
        System.out.println(multiplicar.executar(2,2));
        System.out.println(subtrair.executar(2,2));


    }

}
