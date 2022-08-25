package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        //Forma com funções lambdas
        //Funções LAMBDAS são do paradigma de programação FUNCIONAL.
        //Função anônima - expressão lambda
        //Com esse tipo de função, não é necessário criar uma Classe e definir  a estrutura para depois intanciar, basta apenas colocar o TIPO da interface, o NOME da variável e a FUNÇÃO.

        //A estrutura e os tipos precisam ser iguais a da interface, o retorno também.
        Calculo calc = (x, y) -> {return x + y;};

        System.out.println(calc.executar(2, 4));

        //Quando se omite o PAR de CHAVES o java entende que será apenas "UMA" sentença de código e então o RETURN ocorre de forma automática e implicita.
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2,3));



    }
}
