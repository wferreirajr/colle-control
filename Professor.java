public class Professor extends Fisica{
    private String formacao;
    private String mateiraLecionadas;
    private boolean professorStatus;
    private int matricula;
    private double salario;

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getMateiraLecionadas() {
        return this.mateiraLecionadas;
    }

    public void setMateiraLecionadas(String mateiraLecionadas) {
        this.mateiraLecionadas = mateiraLecionadas;
    }

    public boolean isProfessorStatus() {
        return this.professorStatus;
    }

    public boolean getProfessorStatus() {
        return this.professorStatus;
    }

    public void setProfessorStatus(boolean professorStatus) {
        this.professorStatus = professorStatus;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
