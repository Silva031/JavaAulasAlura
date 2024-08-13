package aulasAlura.aulas;
public class condicional {
    public static void main(String[] args) {
        int anoDelancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDelancamento >= 2022){
            System.out.println("lancamento que o publico esta curtindo!");
        } else {
            System.out.println("Filme retro que o publico adora!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("Plus")){
            System.out.println("Filme disponivel no plano!");
        } else {
            System.out.println("Filme nao disponivel no plano!");
        }
    }
}
