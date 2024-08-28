package aulasAlura.br.com.alura.desafioAudio.modelos;

import javax.print.attribute.standard.Media;

public class Podcast extends Audio {
    private String autor;
    private String titulo;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double getClassificacoes() {
        if (getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
