package roteiro4.parte4;

public class Aluno {
    // Atributos
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas; 
    private String situacao; 

   
    public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
        this.matricula = pMatricula;
        this.nome = pNome;
        this.curso = pCurso;
        this.anoIngresso = pAnoIngresso;
        this.situacao = "Matriculado"; 
    }

  
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

    public int getQtdeDisciplinas() {
        return qtdeDisciplinas;
    }

    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        if (qtdeDisciplinas < 0) {
            throw new IllegalArgumentException("Quantidade de disciplinas não pode ser negativa.");
        }
        this.qtdeDisciplinas = qtdeDisciplinas;
        this.situacao = (qtdeDisciplinas > 0) ? "Matriculado" : "Não Matriculado";
    }

    public String getSituacao() {
        return situacao;
    }
}
