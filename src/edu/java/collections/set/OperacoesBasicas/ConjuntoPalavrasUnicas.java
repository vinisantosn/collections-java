package edu.java.collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        boolean contains = palavrasUnicas.contains(palavra);
        return contains;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.removerPalavra("Swift");
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
