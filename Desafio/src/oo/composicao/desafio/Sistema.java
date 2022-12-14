package oo.composicao.desafio;

public class Sistema {

    static String nome;
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.adicionarItem("Caneta", 1, 100);
        c1.adicionarItem(new Produto("Notebook", 2000), 2);

        Compra c2 = new Compra();
        c2.adicionarItem("Caderno", 10, 10);
        c2.adicionarItem(new Produto("Impressora", 1000), 1);

        Cliente cliente = new Cliente("Andrey");
        cliente.adicionarCompra(c1);
        cliente.listaCompras.add(c2);

        System.out.println(cliente.obterValorTotal());
    }
}
