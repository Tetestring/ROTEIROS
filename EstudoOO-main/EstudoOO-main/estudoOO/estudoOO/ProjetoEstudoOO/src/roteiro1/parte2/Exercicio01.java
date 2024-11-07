package roteiro1.parte2;

public class Exercicio01 {
    public static void main(String[] args) {
        
        double sb = 2500;
        int numHorasExtra = 10;
        double valorHora = sb/ 160;
        double ValorHorasExtras = numHorasExtra * valorHora;
        double salarioTotal = sb + ValorHorasExtras;

        System.out.println("Salario base : " + sb);
        System.out.println("Valor da Hora: " + valorHora);
        System.out.println("Valor das horas extras: " + salarioTotal);
    }
    
}
