package edu.java.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {

        double valorTotalDoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()
            ) {
                valorTotalDoEstoque += p.getQuantidade() * p.getPreco();
            }

        }
        return valorTotalDoEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()
        ) {
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }
}
