package oo.composicao.um_para_muitos;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.nomeCliente = "João Pedro";
        compra1.adicionarItem("Mochila",1,60);
        compra1.adicionarItem("Borracha",4,10);
        compra1.adicionarItem(new Item("Caderno",2,40));

        System.out.println(compra1.adicionarItem.size());
        System.out.println(compra1.obterValorTotal());

        //Só para mostrar a relação bidirecional!!!
        double total = compra1.adicionarItem.get(2).compra.adicionarItem.get(2).compra.obterValorTotal();
        System.out.println("O valor total é R$: "+total);
    }
}
