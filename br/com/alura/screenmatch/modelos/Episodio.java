package aulasAlura.br.com.alura.screenmatch.modelos;

import aulasAlura.br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String titulo;
    private Serie serie;
    private int totalVizualizacoes;

    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVizualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    @Override
    public void setTotalVisualizacoes(int i) {

    }
}
