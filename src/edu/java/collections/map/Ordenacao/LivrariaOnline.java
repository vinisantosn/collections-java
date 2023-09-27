package edu.java.collections.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        String linkParaRemover = null;
        if (!livroMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    linkParaRemover = entry.getKey();
                    livroMap.remove(linkParaRemover);
                    break;
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livroMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()
            ) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(entry.getValue());
                }
            }
        }
        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = 0.0;
        if (!livroMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()
            ) {
                if (entry.getValue().getPreco() > maiorPreco) {
                    maiorPreco = entry.getValue().getPreco();
                    livroMaisCaro = entry.getValue();
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!livroMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()
            ) {
                if (entry.getValue().getPreco() < menorPreco) {
                    menorPreco = entry.getValue().getPreco();
                    livroMaisBarato = entry.getValue();
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50.0);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
//        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.exibirLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livroMap);

    }

}
