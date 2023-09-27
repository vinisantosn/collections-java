package edu.java.collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet
        ) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }


    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5D);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0D);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0D);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8D);
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);
        gerenciadorAlunos.removerAlunoPorMatricula(0L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
