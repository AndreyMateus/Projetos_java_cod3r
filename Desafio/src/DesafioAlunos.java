/*
    @author Andrey mateus
*/
//package "unknow"
import java.util.Scanner;
public class DesafioAlunos {
    public static void main(String[] args) {
        /*
            Desafio abaixo
        */
    //calcular a media das notas de uma turma
    // não se sabe quantos alunos são
    // a nota tem que ser  nota >= 0 e <= 10
    // quando esse nota se enquadrar como válida, você vai armazenar ela em uma variável chamada total
    // toda nova nota deve ser recebida pela variavel total, essa variável deve representar a soma de todas as notas
     // e tem que ter uma outra variável para armazenar todas as notas "válidas"
     // para o usuário  encerrar o programa, basta que ele digite -1 no lugar da nota.

    Scanner entrada = new Scanner(System.in);// entrada de dados

    double notaValidada = 0;//válida se a nota é maior que 0 e menor que 10 - filtro de dado de entrada
    double notasValidas = 0;//contador de quantas novas válidas já foram registradas
    double total = 0;// total de todas notas válidas
    double media;
        while(notaValidada != -1){
            System.out.println("Digite a nota do Aluno: ");
            notaValidada = entrada.nextDouble();
            if(notaValidada >= 0 && notaValidada <= 10){
                    notasValidas++;
                    total += notaValidada;
            }else if(notaValidada == -1){
                System.out.println("O programa foi encerrado");
                System.out.println("A soma de todas as notas é: "+total);
                System.out.println("O número de notas inseridas é: "+notasValidas);
                media = total/notasValidas;
                System.out.println("A média é: "+media);
            }else{
                System.out.println("Nota inválida");
            }
        }
        entrada.close();
    }
}

