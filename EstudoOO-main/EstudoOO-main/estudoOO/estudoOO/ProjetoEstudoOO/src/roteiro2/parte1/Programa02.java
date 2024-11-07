package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = entrada.nextInt();

        
        System.out.println("Idade informada : " + idade);

        entrada.close();
    }
}

