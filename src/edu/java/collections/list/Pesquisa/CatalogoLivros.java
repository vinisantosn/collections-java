package edu.java.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int publicacao){
        livroList.add(new Livro(titulo,autor,publicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList
                 ) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }

            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList
            ) {
                if (l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<=anoFinal){
                    livroPorIntervaloAnos.add(l);
                }

            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList
                 ) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2015);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2016);
        catalogoLivros.adicionarLivro("Livro 3","Autor 2", 2017);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4", 2018);
        catalogoLivros.adicionarLivro("Livro 5","Autor 5", 1970);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2015,2017));
    }







}
