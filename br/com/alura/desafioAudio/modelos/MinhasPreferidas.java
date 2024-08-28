package aulasAlura.br.com.alura.desafioAudio.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacoes() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " tambem é bastante escutado");
        }
    }
}
