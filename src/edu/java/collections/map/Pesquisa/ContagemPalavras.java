package edu.java.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        System.out.println(contagemPalavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        Integer maiorIncidencia = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorIncidencia) {
                maiorIncidencia = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public Map<String, Integer> exibirContagemPalavras() {
        return contagemPalavrasMap;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
