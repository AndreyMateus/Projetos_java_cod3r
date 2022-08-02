package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        //O array é estático, possui tamanho fixo(Não dá para aumentar), porém pode criar um array novo  e de maior tamanho e armazenar o array antigo no array novo.
        //O Array no JAVA é HOMOGÊNIO, só aceita um tipo de DADO.
        //O Array é um objeto, possui ATRIBUTOS e CARACTERISTICAS.
    
    
        double[] notasAlunoA = new double[3];
        notasAlunoA[0]   = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        //exibindo a última nota do array
        System.out.println( notasAlunoA[notasAlunoA.length - 1 ] );
        //System.out.println(notasAlunoA[4]); ERRO - fora dos limites do Array

       //A Classe Arrays possui alguns métodos para arrays.
       //O método toString é um método que mostra todo  o array.
        System.out.println( Arrays.toString(notasAlunoA)  );
        System.out.println(notasAlunoA[2]);

        for(int i =0; i<3; i++){
            System.out.println(notasAlunoA[i] );
        }
        
        //Pergando o número de INDICES/ESPAÇOS de um Array
        double totalAlunoA = 0;
        for(int i = 0; i< notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }
            System.out.println(totalAlunoA / notasAlunoA.length);


        //Outra forma de se instanciar um ARRAY
        final double NOTAARMAZENADA = 5.9;
        double[] notasAlunoB = {7.0,9,NOTAARMAZENADA,10};
        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        //o length é um atributo, um atributo herdado dá estrutura array padrão.
         System.out.println(totalAlunoB / notasAlunoB.length);


    }
}
