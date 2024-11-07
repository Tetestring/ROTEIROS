package roteiro4.parte3;

public class Principal {
    public static void main(String[] args) {
        
        Aluno aluno01 = new Aluno(12345, "João Silva", "Análise e Desenvolvimento de Sistemas", 2023);

        
        System.out.println("Dados do Aluno 01 antes da modificação:");
        System.out.println("Matrícula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de Ingresso: " + aluno01.getAnoIngresso());

        aluno01.setMatricula(54321);

        System.out.println("\nDados do Aluno 01 após a modificação:");
        System.out.println("Matrícula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de Ingresso: " + aluno01.getAnoIngresso());

        Aluno aluno02 = new Aluno(67890, "Maria Oliveira", "Engenharia de Software", 2024);

       
        System.out.println("\nDados do Aluno 02:");
        System.out.println("Matrícula: " + aluno02.getMatricula());
        System.out.println("Nome: " + aluno02.getNome());
        System.out.println("Curso: " + aluno02.getCurso());
        System.out.println("Ano de Ingresso: " + aluno02.getAnoIngresso());
    }
}
