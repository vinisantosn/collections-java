package edu.java.collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoDeConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codidoDoConvite){
        convidadoSet.add(new Convidado(nome,codidoDoConvite));
    }

    public void removerConvidado(int codigoDoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet
        ) {
            if(c.getCodigoDoConvite() == codigoDoConvite){
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
