package aulasAlura.aulas;
import java.util.Scanner;

public class leituraDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // ... your code here ...
        
        leitura.close();

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        

        System.out.println("Digite o ano de lancamento: ");
        int anoDelancamento = leitura.nextInt();

        System.out.println("Digite a nota do filme: ");
        double notaDoFilme = leitura.nextDouble();


        System.out.println("Filme favorito = " + filme);
        System.out.println("Ano de lancamento = " + anoDelancamento);
        System.out.println("Nota do filme = " + notaDoFilme);

    }
}
