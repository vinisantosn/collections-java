package edu.java.collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itensParaRemover
        ) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }

        itensParaRemover.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {

        double valorTotal = 0.0;
        for (Item i : carrinhoDeCompras
        ) {
            double preco;
            int quantidade;
            preco = i.getPreco();
            quantidade = i.getQuantidade();
            valorTotal += preco * quantidade;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();

        carrinhoDeCompras1.adicionarItem("Tenis", 279.99, 1);
        carrinhoDeCompras1.adicionarItem("Camisa", 79.99, 2);
        carrinhoDeCompras1.adicionarItem("Meia", 29.99, 4);
        carrinhoDeCompras1.adicionarItem("Calça Slim", 179.99, 2);
        carrinhoDeCompras1.removerItem("Meia");

        System.out.println(carrinhoDeCompras1.calcularValorTotal());

        carrinhoDeCompras1.exibirItens();
    }
}
