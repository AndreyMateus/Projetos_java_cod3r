package dificuldade_poo_composicao.difi_poo_muitos_para_muitos;

import java.util.ArrayList;
import java.util.List;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.nomeCliente = "andrey";

        Item item1 = new Item("barbeador", 1, 20);
        compra1.itens.add(item1);
        compra1.itens.add(new Item("mouse", 2, 40));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.valorTotal());
        compra1.adicionarItem("teclado", 2, 70);

    }
}
