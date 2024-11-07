package roteiro2.parte4;
//Sim, é possível implementar uma solução que apresente não apenas a média,
// mas também quantas notas ficaram acima da média, utilizando a classe Programa07

public class Resposta {

    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.0, 9.5, 7.0};
        int totalNotas = notas.length;
        double soma = 0;
        
        
        for (double nota : notas) {
            soma += nota;
        }
        
       
        double media = soma / totalNotas;
        System.out.println("Média: " + media);
        
        
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }
        
        
        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
    }
}