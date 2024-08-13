package aulasAlura.aulas;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double media = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do filme: ");
            nota = leitura.nextDouble();
            media += nota;
        }
        System.out.println("A média das notas é: " + media/3);
    }
}
