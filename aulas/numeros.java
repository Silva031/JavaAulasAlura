package aulasAlura.aulas;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        int numero01 = 0, numero02 = 0;

        Scanner leitura = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número: ");
        numero01 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        numero02 = leitura.nextInt();

        if (numero01 > numero02) {
            System.out.println("O número " + numero01 + " é maior que o número " + numero02);
        } else if (numero01 < numero02) {
            System.out.println("O número " + numero02 + " é maior que o número " + numero01);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
