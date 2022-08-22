package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;
public class Item {
    final int quantidade;
    final Produto produto;
    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
