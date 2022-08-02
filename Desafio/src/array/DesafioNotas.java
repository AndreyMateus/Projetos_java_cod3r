package array;

import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas serão ? ");
        int qtdNotas = entrada.nextInt();
        double[] notas = new double[qtdNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Digite a nota: %d \n",i +1);
            notas[i] =  entrada.nextDouble();
        }

        double soma = 0;
        for(double nota: notas){
            soma += nota;
            System.out.printf("Esse é o valor %.2f \n",nota);
        }
        double media = soma / notas.length;
        System.out.printf("A média do aluno é: %.1f \n", media);

        //fechando o input
        entrada.close();

    }
}
