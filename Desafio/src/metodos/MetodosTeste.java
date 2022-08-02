package metodos;

import java.util.Scanner;
public class MetodosTeste {
    public static void main(String[] args) {

        Metodos metodo = new Metodos();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro num");
        int num1 = entrada.nextInt();
        System.out.println("Digite aqui o segundo num");
        int num2 = entrada.nextInt();

        int resposta = metodo.soma(num1,num2);
        System.out.println(resposta);
        String s = resposta >= 20 ? "Maior que 20" : "Menor que 20";
        System.out.println(s);
    }
}
