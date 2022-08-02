package desafiopessoa;

public class Jantar {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Andrey", 80);
        
        Comida c1 = new Comida("Feijão",0.5);
        Comida c2 = new Comida("Pizza",1.0);

        //Se apresentando antes de comer
        p1.apresentar();

        //Peso antes de comer
        System.out.println(p1.peso);

        p1.comer(c1);
        //Peso depois de comer o primeiro prato
        System.out.println(p1.peso);

        p1.comer(c2);
        //Peso depois de comer
        System.out.println(p1.peso);

    }
}
