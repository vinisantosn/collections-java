package edu.java.collections.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> inteirosList;

    public OrdenacaoNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteirosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosPorOrdemAscendente = new ArrayList<>(inteirosList);
        Collections.sort(numerosPorOrdemAscendente);
        return numerosPorOrdemAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosPorOrdemDescendente = new ArrayList<>(inteirosList);
        numerosPorOrdemDescendente.sort(Collections.reverseOrder());

        return numerosPorOrdemDescendente;
    }

    public void exibirNumeros() {
        if (!inteirosList.isEmpty()) {
            System.out.println(inteirosList);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        numeros.exibirNumeros();
        System.out.println(numeros.ordenarAscendente());
        numeros.exibirNumeros();
        System.out.println(numeros.ordenarDescendente());
        numeros.exibirNumeros();
    }

}
