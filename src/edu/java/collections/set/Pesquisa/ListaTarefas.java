package edu.java.collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : tarefaSet
        ) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaSet.remove(t);
                break;
            } else {
                System.out.println("TAREFA NÃO ENCONTRADA.");
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet
        ) {
            if (t.getEstaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet
        ) {
            if (!t.getEstaConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet
        ) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setEstaConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet
        ) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setEstaConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
