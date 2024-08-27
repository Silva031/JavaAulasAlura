package aulasAlura.br.com.alura.desafioAudio.principal;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacoes() {
        return classificacoes;
    }

    public void curte() {
        this.curtidas++;
    }

    public void reproduz() {
        this.totalDeReproducoes++;
    }
}




