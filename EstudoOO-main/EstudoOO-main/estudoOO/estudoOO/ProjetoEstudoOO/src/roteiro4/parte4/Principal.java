package roteiro4.parte4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        System.out.print("Digite o ano de ingresso do aluno: ");
        int anoIngresso = scanner.nextInt();
        
        Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso);
        
        System.out.print("Digite a quantidade de disciplinas: ");
        int qtdeDisciplinas = scanner.nextInt();
        aluno01.setQtdeDisciplinas(qtdeDisciplinas);

        
        System.out.println("\nDados do Aluno 01:");
        System.out.println("Matrícula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de Ingresso: " + aluno01.getAnoIngresso());
        System.out.println("Quantidade de Disciplinas: " + aluno01.getQtdeDisciplinas());
        System.out.println("Situação: " + aluno01.getSituacao());

        scanner.close();
    }
}
