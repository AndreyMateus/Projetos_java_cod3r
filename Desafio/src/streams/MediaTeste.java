package streams;

public class MediaTeste {
    public static void main(String[] args) {

        //Por retornar o próprio objeto, eu posso acessar o método a partir dele novamente.
        Media m1 = new Media().adicionar(8.3).adicionar(6.7);
        Media m2 = new Media().adicionar(7.9).adicionar(6.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1,m2).getValor());


    }
}
