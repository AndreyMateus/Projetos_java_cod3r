package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        //Forma padrão, sem funções lambdas
        Calculo calculo = new Soma();// polimorfismo dinâmico, utilizando o TIPO Calculo para que depois eu consiga sobreescrever o valor da variável com o de outro tipo.
        System.out.println(calculo.executar(4,4));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(4,4));

    }
}
