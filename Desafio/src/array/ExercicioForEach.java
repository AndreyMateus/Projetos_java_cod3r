package array;

public class ExercicioForEach {
    public static void main(String[] args) {
        
        //Quando estiver usando o ForEach - pense sempre que vai manipular o ÍNDICE e não o array inteiro.

        double[] notasAlunoA = new double[3];
        notasAlunoA[0]   = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;


        for(double nota : notasAlunoA){
            System.out.println(nota);
        }
       

        double totalAlunoA = 0;
        for(double nota : notasAlunoA){
            totalAlunoA += nota;
        }
            System.out.println(totalAlunoA / notasAlunoA.length);

//----------------------------------------------------------------
       
        final double NOTAARMAZENADA = 5.9;
        double[] notasAlunoB = {7.0,9,NOTAARMAZENADA,10};
        double totalAlunoB = 0;

        for(double nota: notasAlunoB){
          totalAlunoB += nota;
        }
         System.out.println(totalAlunoB / notasAlunoB.length);


    }
}
