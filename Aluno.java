public class Aluno extends Fisica {
    private String formacao;
    private String CursoCursando;
    private boolean alunoStatus;
    private int matricula;
 
    public String getFormacao() {
       return this.formacao;
    }
 
    public void setFormacao(String formacao) {
       this.formacao = formacao;
    }
 
    public String getCursoCursando() {
       return this.CursoCursando;
    }
 
    public void setCursoCursando(String CursoCursando) {
       this.CursoCursando = CursoCursando;
    }
 
    public boolean isAlunoStatus() {
       return this.alunoStatus;
    }
 
    public boolean getAlunoStatus() {
       return this.alunoStatus;
    }
 
    public void setAlunoStatus(boolean alunoStatus) {
       this.alunoStatus = alunoStatus;
    }
 
    public int getMatricula() {
       return this.matricula;
    }
 
    public void setMatricula(int matricula) {
       this.matricula = matricula;
    }
 }