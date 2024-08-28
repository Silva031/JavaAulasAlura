package aulasAlura.br.com.alura.desafioAudio.principal;

import aulasAlura.br.com.alura.desafioAudio.modelos.MinhasPreferidas;
import aulasAlura.br.com.alura.desafioAudio.modelos.Musica;
import aulasAlura.br.com.alura.desafioAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Innerbloom");
        minhaMusica.setArtista("Rufus du Sol");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PodPah");
        meuPodcast.setAutor("Igão e Mitico");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 5000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
