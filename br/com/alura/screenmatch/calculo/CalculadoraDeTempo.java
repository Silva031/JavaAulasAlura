package aulasAlura.br.com.alura.screenmatch.calculo;

import aulasAlura.br.com.alura.screenmatch.modelos.Filme;
import aulasAlura.br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
