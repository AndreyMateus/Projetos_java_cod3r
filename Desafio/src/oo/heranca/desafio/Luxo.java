package oo.heranca.desafio;

public interface Luxo {
    //POR PADRÃO "TODO" MÉTODO DENTRO DE UMA INTERFACE É PÚBLICO/PUBLIC e ABSTRATIC, mesmo que isso não esteja explicito.
   public void ligarAr(); //public explicito

    void desligarAr();//public implicito

    // default - valor padrão caso não queiram implementar este método dentro de uma subclasse
    default int velocidadeDoAr(){
        return 1;
    };
}
