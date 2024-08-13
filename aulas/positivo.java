package aulasAlura.aulas;
import java.util.Scanner;

public class positivo {
    public static void main(String[] args) {
        int numero = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
            
        }
    }
}
