import java.beans.beancontext.BeanContextChild;
import java.util.Scanner;

public class Cadastro {

    public void NewCadastro(int NewCadastro) {
        Scanner leitor = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o Nome!");
        pessoa.setNome(leitor.nextLine());

        System.out.println("Digite o Email!");
        pessoa.setEmail(leitor.nextLine());
        
         System.out.println("Digite o Telefone!"); 
         pessoa.setTelefone(leitor.nextLine());

        System.out.println("Digite o Endereco!");
        pessoa.setEndereco(leitor.nextLine());

        System.out.println("Digite o Bairro!");
        pessoa.setBairro(leitor.nextLine());

        System.out.println("Digite o Complemento!");
        pessoa.setComplemento(leitor.nextLine());

        System.out.println("Digite o Cidade!");
        pessoa.setCidade(leitor.nextLine());

        System.out.println("Digite o Estado!");
        pessoa.setEstado(leitor.nextLine());

        System.out.println("Digite o Cep!");
        pessoa.setCep(leitor.nextInt());

        System.out.println("Digite o Numero!");
        pessoa.setNumero(leitor.nextInt());

        

        switch (NewCadastro) {
            
            case 1:
            System.out.println("Cadastrando Professor");
            break;
           
            case 2:
            System.out.println("Cadastrando Fornecedor");
            break;
            
            case 3:
            Aluno newAlu = new Aluno();
           
            System.out.println("Digite qual curso o Aluno esta cursando: ");
            newAlu.setCursoCursando(leitor.nextLine());

            System.out.println("Digite AT se o aluno estiver ativo ou NA para não ativo: ");
            if(leitor.nextLine().equalsIgnoreCase("AT")){
            newAlu.setAlunoStatus(true);
            }else{
                newAlu.setAlunoStatus(false);
            }

            System.out.println("Digite a formação do Aluno: ");
            newAlu.setFormacao(leitor.nextLine());

            System.out.println("Informe a Matricula do Aluno: ");
            newAlu.setMatricula(leitor.nextInt());

            break;

    }
}

    public void optConsultaPfs() {
        System.out.println("Escolheu a opção consultar PROFESSOR!");
    }

    public void optConsultaFncd() {
        System.out.println("Escolheu a opção consultar FORNECEDOR!");
    }

    public void optConsultaAln() {
        System.out.println("Escolheu a opção consultar ALUNO!");
    }
}
