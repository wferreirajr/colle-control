import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void printMenu(String[] options) {

        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Escolha a opção desejada: ");
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[] files = { "professores.txt", "fornecedores.txt", "alunos.txt" };
        String headerF = "Nome,Email,Telefone,Endereco,Numero,Complemento,Bairro,Cidade,Estado,Cep,Razaosocial,CNPJ,Contato,Status";
        String headerP = "Nome,Email,Telefone,Endereco,Bairro,Complemento,Cidade,Estado,Cep,Numero,Sobrenome,CPF,Datanascimento,Formacao,Materialecionadas,ProfessorStatus,Matricula,Salario";
        String headerA = "Nome,Email,Telefone,Endereco,Numero,Complemento,Bairro,Cidade,Estado,Cep,Sobrenome,CPF,Datanascimento,Formacao,Cursocursando,Alunostatus,Matricula";

        for (String file : files) {
            try {
                File checkFile = new File(file);

                if (checkFile.createNewFile()) {
                    FileWriter flWrite = new FileWriter(file);

                    System.out.println("Arquivo criado: " + checkFile.getName());
                    if (file == "professores.txt") {
                        flWrite.write(headerP);
                        flWrite.append(System.getProperty("line.separator"));
                        flWrite.close();
                    }
                    if (file == "fornecedores.txt") {
                        flWrite.write(headerF);
                        flWrite.append(System.getProperty("line.separator"));
                        flWrite.close();
                    }
                    if (file == "alunos.txt") {
                        flWrite.write(headerA);
                        flWrite.append(System.getProperty("line.separator"));
                        flWrite.close();
                    }
                } else {
                    System.out.println("Arquivo já existe: " + checkFile.getName());
                }
            } catch (Exception e) {
                System.out.println("Ocorreu erro");
                e.printStackTrace();
            }
        }

        Cadastro cad = new Cadastro();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        String[] options = {

                "1  - Cadastro Professor", "2  - Cadastro Fornecedor", "3  - Cadastro Aluno", "4  - Consulta Professor",
                "5  - Consulta Fornecedor", "6  - Consulta Aluno", "0  - Sair" };

        Scanner scanner = new Scanner(System.in);
        int option = 50;
        while (option != 0) {
            System.out.println("*************** Seja Bem Vindo!!! ***************");
            switch (option) {

            case 1:
                cad.NewCadastro(1);
                break;
            case 2:
                cad.NewCadastro(2);
                break;
            case 3:
                cad.NewCadastro(3);
                break;
            case 4:
                cad.NewConsulta("ConProf");
                break;
            case 5:
                cad.NewConsulta("ConForn");
                break;
            case 6:
                cad.NewConsulta("ConAlu");
                break;
            case 50:
                printMenu(options);
                break;
            }
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Por favor, digite um valor valido.");
                scanner.next();
            } catch (Exception ex) {
                System.out.println("Erro inesperado.");
                scanner.next();
            }
        }
    }
}
