package roteiro3.parte1;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário-base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = Programa11.calcGrat(salarioBase);
        double imposto = Programa11.calcImp(salarioBase);

    
        double salarioReceber = salarioBase + gratificacao - imposto;


        System.out.printf("O salário a receber é: R$ %.2f%n", salarioReceber);

        scanner.close();
    }

    public static double calcGrat(double salarioBase) {
        return salarioBase * 0.05;
    }

    public static double calcImp(double salarioBase) {
        return salarioBase * 0.07;
    }
}
