package aulasAlura.aulas;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Gabriel Silva";
        String tipoConta = "Conta Corrente";
        double saldo = 1000.00;
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        while (escolha != 4) {
            System.out.println("\n-----Dados do cliente-----");
            System.out.println("\nNome do cliente: " + nome);
            System.out.println("Tipo da conta: " + tipoConta);
            System.out.println("Saldo da conta: R$ " + saldo);

            System.out.println("\n-----Menu-----");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o valor do depósito: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso.");
            } else if (escolha == 2) {
                System.out.print("Digite o valor do saque: ");
                double saque = scanner.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso.");
                }
            } else if (escolha == 3) {
                System.out.println("Saldo da conta: R$ " + saldo);
            } else if (escolha == 4) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                
            }
            
            
        }
        scanner.close();
    }
}
