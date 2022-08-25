package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        //Forma padrão, sem funções lambdas
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(4,4));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(4,4));

    }
}
