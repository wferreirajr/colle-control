public class Cadastro {
    private String nome;

    public Cadastro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s", this.nome);
    }
}
