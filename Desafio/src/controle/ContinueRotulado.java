package controle;

public class ContinueRotulado {
    public static void main(String[] args) {

        externo:
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
            if(i == 1){
                continue externo; // se tiver só o continue sem o rótulo, será executado o laço interno e não o laço chamado que é o externo.
                }
                System.out.printf("%d %d \n",i,j);
            }
        }


    }
}
