package controle;

public class Continue {
    public static void main(String[] args) {
        // o continue interrompe apenas "a atual iteração/determinada parte do código".
        for (int i = 0; i< 10; i++ ){
            // "Se" o resto da dividão de i por 2 for igual a 1, então cancele essa parte do código e continue em frente.
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }

    for(int i = 0; i <10; i++){
        if(i == 5) continue; //o loop de valor 5 será ignorado e o programa continuará em frente
        System.out.println(i);
    }

    }
}
