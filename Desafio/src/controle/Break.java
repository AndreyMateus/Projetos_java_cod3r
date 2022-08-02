package controle;

public class Break {
    public static void main(String[] args) {
    //o break é uma palavra que quebra o fluxo
        for(int i = 0; i<10; i++){
            if(i == 5){
                break;// aqui o break interrompe o FOR
            }
            System.out.println(i);
        }
        System.out.println("Fim!");
    }
}
