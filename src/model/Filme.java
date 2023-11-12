/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Filme {
    
    	private Integer codFilme;
	private String titulo;
	private String genero;
	private String sinopse;
	private Integer duracao;
	private ArrayList<Item> itens = new ArrayList<>();
	private ArrayList<Ator> atores = new ArrayList<>();
        
    public Filme() {}
    
    public Filme(String titulo, String genero, String sinopse, Integer duracao) {
    this.titulo = titulo;
    this.genero = genero;
    this.sinopse = sinopse;
    this.duracao = duracao;
    }

    public Integer getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(Integer codFilme) {
        this.codFilme = codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }
    
    public void cadastrarFilme(Filme filme) {}
}
