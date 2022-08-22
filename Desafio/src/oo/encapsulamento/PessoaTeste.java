package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Andrey","Mateus",30); // alterar valor

       // p1.idade = -30;// ler valor
        System.out.println(p1.toString());
        p1.setIdade(20);
        p1.setIdade(-40);
        System.out.println(p1.getIdade());
        System.out.println(p1.getNomeCompleto());




    }
}
