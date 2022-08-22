package oo.composicao.um_para_muitos;

import java.util.ArrayList;

public class Compra {

    String nomeCliente;

    //só se podem adicionar dados do TIPO ITEM nessa lista.
    ArrayList<Item> adicionarItem = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double valor){
        this.adicionarItem(new Item(nome, quantidade, valor));
    }
    void adicionarItem(Item item){
        this.adicionarItem.add(item);
        item.compra = this;
    }

    double obterValorTotal (){
        double total = 0;
        for(Item item : adicionarItem){
             total += item.quantidade * item.preco;
        }
        return total;
    }


}
