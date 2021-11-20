import java.beans.beancontext.BeanContextChild;
import java.util.Scanner;

public class Cadastro {

    public void NewCadastro(int NewCadastro) {
        Scanner leitor = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o Nome: ");
        pessoa.setNome(leitor.nextLine());

        System.out.print("Digite o Email: ");
        pessoa.setEmail(leitor.nextLine());
        
         System.out.print("Digite o Telefone: "); 
         pessoa.setTelefone(leitor.nextLine());

        System.out.print("Digite o Endereco: ");
        pessoa.setEndereco(leitor.nextLine());

        System.out.print("Digite o Bairro: ");
        pessoa.setBairro(leitor.nextLine());

        System.out.print("Digite o Complemento: ");
        pessoa.setComplemento(leitor.nextLine());

        System.out.print("Digite o Cidade: ");
        pessoa.setCidade(leitor.nextLine());

        System.out.print("Digite o Estado: ");
        pessoa.setEstado(leitor.nextLine());

        System.out.print("Digite o Cep: ");
        pessoa.setCep(leitor.nextInt());

        System.out.print("Digite o Numero: ");
        pessoa.setNumero(leitor.nextInt());        

        switch (NewCadastro) {
            
            case 1:
            Professor newProf = new Professor();

            System.out.print("Digite a formação do professor: ");
            newProf.setFormacao(leitor.nextLine());

            System.out.print("Digite as materios lecionadas pelo professor (separador ;): ");
            newProf.setMateiraLecionadas(leitor.nextLine());

            System.out.print("Digite o status do professor (true / false): ");
            newProf.setProfessorStatus(leitor.nextBoolean());
            
            System.out.print("Digite a matricula do professor (ex. 123456): ");
            newProf.setMatricula(leitor.nextInt());

            System.out.print("Digite o salário professor: (ex. 10.000.00)");
            newProf.setSalario(leitor.nextDouble());
            break;
           
            case 2:
            System.out.println("Cadastrando Fornecedor");
           
            break;
            
            case 3:
            Aluno newAlu = new Aluno();
           
            System.out.print("Digite qual curso o Aluno esta cursando: ");
            newAlu.setCursoCursando(leitor.nextLine());

            System.out.print("Digite AT se o aluno estiver ativo ou NA para não ativo: ");
            if(leitor.nextLine().equalsIgnoreCase("AT")){
            newAlu.setAlunoStatus(true);
            }else{
                newAlu.setAlunoStatus(false);
            }

            System.out.print("Digite a formação do Aluno: ");
            newAlu.setFormacao(leitor.nextLine());

            System.out.print("Informe a Matricula do Aluno: ");
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
