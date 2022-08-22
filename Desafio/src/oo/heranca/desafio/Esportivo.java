package oo.heranca.desafio;

//public class nomeDaClasse - também não teria problema, pois podemos transforma uma classe em uma interface.
public interface Esportivo {
    //dentro de uma interface um método não pode ter corpo

    //POR PADRÃO "TODO" MÉTODO DENTRO DE UMA INTERFACE É PÚBLICO/PUBLIC e ABSTRATIC, mesmo que isso não esteja explicito.
   public void ligarTurbo();//public explicito
    void desligarTurbo();//public implicito
}
