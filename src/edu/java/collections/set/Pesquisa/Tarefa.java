package edu.java.collections.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean estaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setEstaConcluida(boolean estaConcluida) {
        this.estaConcluida = estaConcluida;
    }

    public boolean getEstaConcluida() {
        return estaConcluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", estaConcluida=" + estaConcluida +
                '}';
    }
}
