package edu.java.collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList
        ) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("TASK1");
        listaTarefa.adicionarTarefa("TASK2");
        listaTarefa.adicionarTarefa("TASK3");
        listaTarefa.adicionarTarefa("TASK4");
        listaTarefa.adicionarTarefa("TASK4");
        listaTarefa.removerTarefa("TASK4");
        System.out.println(listaTarefa.obterNumeroDeTarefas());
        listaTarefa.obterDescricaoTarefas();
    }
}
