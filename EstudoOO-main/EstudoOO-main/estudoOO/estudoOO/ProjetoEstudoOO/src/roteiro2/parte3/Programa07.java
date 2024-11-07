package roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota, soma = 0, quantidadeNotas = 0; 
        double media;

        System.out.println("Digite as notas. Para encerar, digite -1.");

        while (true) {
            nota = entrada.nextInt();

            if (nota == -1) {
                break;
            }

            soma += nota;
            quantidadeNotas++;
        }

        if (quantidadeNotas > 0){
            media = (double) soma / quantidadeNotas;
            System.out.printf("A média das notas é: %.2f", media);
        }
        else {
            System.out.println("Nenhuma nota foi informada.");
        }
        entrada.close();
    }

}
