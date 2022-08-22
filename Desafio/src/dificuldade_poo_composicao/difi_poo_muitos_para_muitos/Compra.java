package dificuldade_poo_composicao.difi_poo_muitos_para_muitos;

import colecoes_filas.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    String nomeCliente;
    List<Item> itens = new ArrayList<>();

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }
    void adicionarItem(String nome, int quantidade, double valor){
       this.adicionarItem(new Item(nome,quantidade,valor));
    }

    double valorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.preco * item.quantidade;
        }
        return total;
    }


}
