package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Gera um número secreto aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        // Loop até o usuário acertar o número
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
            }
        }

        scanner.close();
    }
}    