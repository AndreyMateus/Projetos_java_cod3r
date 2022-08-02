package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        //Matriz nada mais é que UM ARRAY DENTRO de OUTRO ARRAY.

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos alunos serão ? ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas serão ? ");
        int qtdNotas = entrada.nextInt();

        double[][] notaAlunos = new double[qtdAlunos][qtdNotas];

        double total = 0;

        for(int a = 0; a < notaAlunos.length; a++){
            if( a != 0){
                System.out.printf("Digite a nota do aluno número: %d \n",a+1);
            }

            for(int n = 0 ; n < notaAlunos[a].length; n++){
                System.out.printf("Digite a %d nota do aluno: %d \n",n+1, a+1);
                notaAlunos[a][n] = entrada.nextDouble();

                //armazendo o
                total += notaAlunos[a][n];  
            }
        }
        //média da turma
        double media = total / (qtdAlunos*qtdNotas);

        System.out.printf("A média da turma é %.2f: " , media);

        //valor de notas da turma
        //System.out.println(Arrays.toString(notaAlunos));


        for(double[] notaDoAlunoIndividual: notaAlunos){
            System.out.println(Arrays.toString(notaDoAlunoIndividual));
        }

    
        //fechando o input
        entrada.close();
    }
}
