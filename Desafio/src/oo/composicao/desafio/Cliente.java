package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;
public class Cliente {
    final String nome;
    //Um cliente vai ter uma lista de compras.
    final List<Compra> listaCompras = new ArrayList<>();
    Cliente(String nome) {
        this.nome = nome;
    }
    double obterValorTotal() {
        double total = 0;
        for (Compra compra : listaCompras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
    void adicionarCompra(Compra compra) {
        this.listaCompras.add(compra);
    }
}
