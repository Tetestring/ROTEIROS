package roteiro3.parte1;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário-base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        
        double gratificacao = Programa12.calcPercentual(salarioBase, 0.05);
        double imposto = Programa12.calcPercentual(salarioBase, 0.07);

        double salarioReceber = salarioBase + gratificacao - imposto;

       
        System.out.printf("O salário a receber é: R$ %.2f%n", salarioReceber);

        scanner.close();
    }

    
    public static double calcPercentual(double valor, double percentual) {
        return valor * percentual;
    }
}
