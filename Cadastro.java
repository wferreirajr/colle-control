import java.util.Scanner;

public class Cadastro {

    public void NewCadastro(int NewCadastro) {
        Scanner leitor = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o primeiro Nome: ");
        pessoa.setNome(leitor.nextLine());

        switch (NewCadastro) {

        case 1:
            Professor newProf = new Professor();

            System.out.print("Digite o Sobrenome: ");
            newProf.setSobrenome(leitor.nextLine());

            System.out.print("Digite o seu CPF no formato: 000.000.000-00 ");
            newProf.setCpf(leitor.nextLine());

            System.out.print("Digite a data de nascimento no formato: 00/00/0000");
            newProf.setDataNascimento(leitor.nextLine());

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
            Fornecedor neWForn = new Fornecedor();

            System.out.print("Digite a razão social: ");
            neWForn.setRazaoSocial(leitor.nextLine());

            System.out.print("Digite o CNPJ no formato: XX. XXX. XXX/0001-XX");
            neWForn.setCnpj(leitor.nextLine());

            break;

        case 3:
            Aluno newAlu = new Aluno();

            System.out.print("Digite o Sobrenome: ");
            newAlu.setSobrenome(leitor.nextLine());

            System.out.print("Digite o seu CPF no formato: 000.000.000-00 ");
            newAlu.setCpf(leitor.nextLine());

            System.out.print("Digite a data de nascimento no formato: 00/00/0000");
            newAlu.setDataNascimento(leitor.nextLine());

            System.out.print("Digite qual curso o Aluno esta cursando: ");
            newAlu.setCursoCursando(leitor.nextLine());

            System.out.print("Digite AT se o aluno estiver ativo ou NA para não ativo: ");
            if (leitor.nextLine().equalsIgnoreCase("AT")) {
                newAlu.setAlunoStatus(true);
            } else {
                newAlu.setAlunoStatus(false);
            }

            System.out.print("Digite a formação do Aluno: ");
            newAlu.setFormacao(leitor.nextLine());

            System.out.print("Informe a Matricula do Aluno: ");
            newAlu.setMatricula(leitor.nextInt());

            break;
        }

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
    }

    public void NewConsulta(String NewConsulta) {

        switch (NewConsulta) {
        case "ConProf":
            System.out.println("Consulta Prof");
            break;

        case "ConForn":
            System.out.println("Consulta Forn");
            break;

        case "ConAlu":
            System.out.println("Consulta Auno");
            break;

        }

    }

}
