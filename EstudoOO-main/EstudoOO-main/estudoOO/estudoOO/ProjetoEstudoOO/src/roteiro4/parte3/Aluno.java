package roteiro4.parte3;

public class Aluno {
    
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    
    public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
        this.matricula = pMatricula;
        this.nome = pNome;
        this.curso = pCurso;
        this.anoIngresso = pAnoIngresso;
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}

