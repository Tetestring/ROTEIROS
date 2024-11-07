package roteiro3.parte2;

import java.util.Scanner;

public class Programa14 {
    
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe o valor de x ");
            double x = entrada.nextDouble();
            System.out.println("Informe a operação (+, -, *, /) ");
            String op = entrada.next();
            System.out.println("Informe o valor de y ");
            double y = entrada.nextDouble();

            
            double resultado;

        
            switch (op) {
                case "+":
                    resultado = soma(x, y);
                    break;
                case "-":
                    resultado = subtracao(x, y);
                    break;
                case "*":
                    resultado = multiplicacao(x, y);
                    break;
                case "/":
                    resultado = divisao(x, y);
                    break;
                default:
                    System.out.println("Operação inválida");
                    return; 
            }

            
            System.out.printf("Resultado: %.2f%n", resultado);
        }
    }
    
    public static double soma(double x, double y) {
        return x + y;
    }
    
    public static double subtracao(double x, double y) {
        return x - y;
    }
   
    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double divisao(double x, double y) {
        if (y == 0) {
            System.out.println("Erro: Divisão por zero");
            return 0;
        }
        return x / y;
    }
}
