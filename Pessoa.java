public class Pessoa extends Cadastro{
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        super(nome);
        this.sobrenome = sobrenome;
    }

    public void setSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getSobreNome() {
        return this.sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s\n" + "Sobrenome: %s", super.toString(), this.sobrenome);
    }
}
