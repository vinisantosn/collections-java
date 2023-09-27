package edu.java.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> inteirosList;

    public SomaNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteirosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!inteirosList.isEmpty()) {
            for (Integer i : inteirosList
            ) {
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!inteirosList.isEmpty()) {
            for (Integer i : inteirosList
            ) {
                if (i > maiorNumero) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;

    }

    public int encontrarMenorNumero() {
        int menorNumero = encontrarMaiorNumero();
        if (!inteirosList.isEmpty()) {
            for (Integer i : inteirosList
            ) {
                if (i < menorNumero) {
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    @Override
    public String toString() {
        return "{" +
                "inteirosList=" + inteirosList +
                '}';
    }

    public void exibirNumeros() {
        System.out.println(inteirosList);
    }

    public static void main(String[] args) {
        SomaNumeros listaDeInteiros = new SomaNumeros();

        listaDeInteiros.adicionarNumero(10);
        listaDeInteiros.adicionarNumero(11);
        listaDeInteiros.adicionarNumero(12);
        System.out.println(listaDeInteiros.calcularSoma());

        System.out.println(listaDeInteiros.encontrarMaiorNumero());
        System.out.println(listaDeInteiros.encontrarMenorNumero());

        listaDeInteiros.exibirNumeros();
    }
}
