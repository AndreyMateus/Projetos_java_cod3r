package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 4356.89;

    var p2 = new Produto();
    p2.nome = "Caneta preta";
    p2.preco = 12.56;

    //Caso queira alterar o valor do DESCONTO, faça isso explicitamente chamando a classe



    System.out.println(p1.nome);
    System.out.println(p2.nome);

    double precoFinal1 = p1.precoComDesconto();
    System.out.printf("%.2f \n",precoFinal1);

    double precoFinal2 = p2.precoComDesconto();
    System.out.printf("%.2f \n",precoFinal2);

    double mediaCarrinho = (precoFinal1 + precoFinal2) / 2 ;
    System.out.println("A média do carrinho = "+mediaCarrinho);





    }
}
