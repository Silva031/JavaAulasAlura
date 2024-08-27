package aulasAlura;

import aulasAlura.br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import aulasAlura.br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import aulasAlura.br.com.alura.screenmatch.modelos.Episodio;
import aulasAlura.br.com.alura.screenmatch.modelos.Filme;
import aulasAlura.br.com.alura.screenmatch.modelos.Serie;

public class Principal {

        public static void main(String[] args) {
            Filme meuFilme = new Filme();
            meuFilme.setNome("O poderoso chefão");
            meuFilme.setAnoDeLancamento(1970);
            meuFilme.setDuracaoEmMinutos(180);


            meuFilme.exibeFichaTecnica();
            meuFilme.avalia(8);
            meuFilme.avalia(5);
            meuFilme.avalia(10);
            System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
            System.out.println(meuFilme.pegaMedia());
            /*
            meuFilme.somaDasAvaliacoes = 10;
            meuFilme.totalDeAvaliacoes = 1;
            System.out.println(meuFilme.pegaMedia());
            */

            Serie Dark = new Serie();
            Dark.setNome("Dark");
            Dark.setAnoDeLancamento(2018);
            Dark.setTemporadas(3);
            Dark.setEpisodiosPorTemporadas(10);
            Dark.setMinutosPorEpisodio(50);
            Dark.exibeFichaTecnica();
            System.out.println("Duracao para maratonar Dark: " + Dark.getDuracaoEmMinutos());

            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.inclui(meuFilme);
            calculadora.inclui(Dark);

            System.out.println(calculadora.getTempoTotal());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(meuFilme);

            Episodio episodio = new Episodio();
            episodio.setNumero(1);
            episodio.setSerie(Dark);
            episodio.setTotalVizualizacoes(300);
            filtro.filtra(episodio);

        }
    }

