package aulasAlura.aulas;
import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        // Gerar um número aleatório
        int numero = new Random().nextInt(100);

        Scanner leitura = new Scanner(System.in);


        for (int i = 0; i <= 5; i++) {

            System.out.println("Digite um número: ");
            int chute = leitura.nextInt();

            if (chute == numero) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (chute > numero) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("O número é maior.");
            }
        }
        System.out.println("O número era: " + numero);
    }
}
