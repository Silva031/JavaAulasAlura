package aulasAlura.br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Assista depois");
        }


    }
}
