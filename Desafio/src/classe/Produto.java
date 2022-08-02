package classe;

public class Produto {

    String nome;
    double preco;

    //variável com valor compartilhado
     static double desconto = 0.25;

    //Construtor padrão
    Produto(){

    }
    // Construtor personalizado
    Produto(String nome){
        this.nome = nome;
    }

    double precoComDesconto() {
        return  preco *(1 - desconto);
    }
    double precoComDesconto(double descontoGerente) {
        return  preco *(1 - desconto + descontoGerente);
    }

}
