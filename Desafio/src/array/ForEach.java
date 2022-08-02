package array;

public class ForEach {
    //For Each - Para Cada 

    public static void main(String[] args) {
        
        double[] notas = {9.9,8.7,7.2,9.4};

        //Embora seja scrito ForEach, aqui é só FOR, oque muda realmente é a estrutura.
        //Ele percorre todos os índices sem que você precise expliciar isso, ele faz automaticamente e sem ajuda.
        //O ForEach é bom pois você não precisa se preocupar em controlar o laço de repetição, ele faz tudo sozinho.
        for (double nota : notas) {
            System.out.println(nota);
        }


    }
}
