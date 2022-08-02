package controle;

public class BreakRotulado {
    public static void main(String[] args) {
        //Usar o BREAK e o CONTINUE é algo normal, porém EVITE AO MÁXIMO utilizar  eles em seu código, pois irá dificultar a leitura e o entedimento da lógica.
        // Mesmo sendo um Break rotulado, não é aconselhavel utilizar em seu código, pois o deixará muito complexo

        //aqui estamos dando um nome/rótulo ao FOR para que possamos chamar ele ou referenciá-lo
        externo:for (int i = 0; i<10; i++){
                for (int j = 0; j < 3; j++){
                    if(i == 1){
                        // Esse IF irá usar uma variável externa como condição, porém o seu código só será executado internamente.
                       break externo; //estamos referenciando o laço for que se chama EXTERNO
                    }
                    System.out.printf("%d %d",i,j);
                }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}
