import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cadastro {

    String dadosCadas = "";
    String dadosProf = "";
    String dadosForn = "";
    String dadosAlun = "";
    int selUsuario = 0;

    public void NewCadastro(int NewCadastro) {
        System.out.print("\033[H\033[2J");
        Scanner leitor = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        if (NewCadastro == 1) {
            System.out.print("Digite o primeiro Nome: ");
            pessoa.setNome(leitor.nextLine());
            dadosCadas = pessoa.getNome();
        } else if (NewCadastro == 3) {
            System.out.print("Digite o primeiro Nome: ");
            pessoa.setNome(leitor.nextLine());
            dadosAlun = pessoa.getNome();
        }

        switch (NewCadastro) {

        case 1:
            Professor newProf = new Professor();

            System.out.print("Digite o Sobrenome: ");
            newProf.setSobrenome(leitor.nextLine());
            dadosProf += ","+newProf.getSobrenome();

            System.out.print("Digite o seu CPF no formato (000.000.000-00): ");
            newProf.setCpf(leitor.nextLine());
            dadosProf += ","+newProf.getCpf();            

            System.out.print("Digite a data de nascimento no formato (dd/MM/YYYY): ");
            newProf.setDataNascimento(leitor.nextLine());
            dadosProf += ","+newProf.getDataNascimento();

            System.out.print("Digite a formação do professor: ");
            newProf.setFormacao(leitor.nextLine());
            dadosProf += ","+newProf.getFormacao();

            System.out.print("Digite as materios lecionadas pelo professor (separado por ;): ");
            newProf.setMateiraLecionadas(leitor.nextLine());
            dadosProf += ","+newProf.getMateiraLecionadas();

            System.out.print("Digite o status do professor (true / false): ");
            newProf.setProfessorStatus(leitor.nextBoolean());
            dadosProf += ","+newProf.getProfessorStatus();

            System.out.print("Digite a matricula do professor (ex. 000000): ");
            newProf.setMatricula(leitor.nextInt());
            dadosProf += ","+newProf.getMatricula();

            System.out.print("Digite o salário professor: (ex. 10000.00): ");
            newProf.setSalario(leitor.nextDouble());
            dadosProf += ","+newProf.getSalario();

            break;

        case 2:
            Juridica juridica = new Juridica();
            Fornecedor neWForn = new Fornecedor();

            System.out.print("Digite a razão social: ");
            juridica.setRazaoSocial(leitor.nextLine());
            dadosForn = juridica.getRazaoSocial();

            System.out.print("Digite o CNPJ no formato (00.000.000/0000-00): ");
            juridica.setCnpj(leitor.nextLine());
            dadosForn += "," + juridica.getCnpj();

            System.out.print("Digite o nome do contato: ");
            neWForn.setContato(leitor.nextLine());
            dadosForn += "," + neWForn.getContato();

            System.out.print("Digite o status do fornecedor (true / false): ");
            neWForn.setStatus(leitor.nextBoolean());
            dadosForn += "," + neWForn.getStatus();

            break;

        case 3:
            Aluno newAlu = new Aluno();

            System.out.print("Digite o Sobrenome: ");
            newAlu.setSobrenome(leitor.nextLine());
            dadosAlun += "," + newAlu.getSobrenome();

            System.out.print("Digite o seu CPF no formato (000.000.000-00): ");
            newAlu.setCpf(leitor.nextLine());
            dadosAlun += "," + newAlu.getCpf();

            System.out.print("Digite a data de nascimento no formato (dd/MM/YYYY): ");
            newAlu.setDataNascimento(leitor.nextLine());
            dadosAlun += "," + newAlu.getDataNascimento();

            System.out.print("Digite a formação do Aluno: ");
            newAlu.setFormacao(leitor.nextLine());
            dadosAlun += "," + newAlu.getFormacao();

            System.out.print("Digite qual curso o Aluno esta cursando: ");
            newAlu.setCursoCursando(leitor.nextLine());
            dadosAlun += "," + newAlu.getCursoCursando();

            System.out.print("Digite AT se o aluno estiver ativo ou NA para não ativo: ");
            if (leitor.nextLine().equalsIgnoreCase("AT")) {
                newAlu.setAlunoStatus(true);
                dadosAlun += "," + newAlu.getAlunoStatus();
            } else {
                newAlu.setAlunoStatus(false);
                dadosAlun += "," + newAlu.getAlunoStatus();
            }

            System.out.print("Informe a Matricula do Aluno (ex. 000000): ");
            newAlu.setMatricula(leitor.nextInt());
            dadosAlun += "," + newAlu.getMatricula();

            break;
        
        }

        pessoa.setEmail(leitor.nextLine());
        System.out.print("Digite o Email formato (xxxxxx@yyy.com): ");
        pessoa.setEmail(leitor.nextLine());
        dadosCadas += ","+pessoa.getEmail();

        System.out.print("Digite o Telefone: ");
        pessoa.setTelefone(leitor.nextLine());
        dadosCadas += ","+pessoa.getTelefone();

        System.out.print("Digite o Endereco: ");
        pessoa.setEndereco(leitor.nextLine());
        dadosCadas += ","+pessoa.getEndereco();

        System.out.print("Digite o Bairro: ");
        pessoa.setBairro(leitor.nextLine());
        dadosCadas += ","+pessoa.getBairro();

        System.out.print("Digite o Complemento: ");
        pessoa.setComplemento(leitor.nextLine());
        dadosCadas += ","+pessoa.getComplemento();

        System.out.print("Digite o Cidade: ");
        pessoa.setCidade(leitor.nextLine());
        dadosCadas += ","+pessoa.getCidade();

        System.out.print("Digite o Estado: ");
        pessoa.setEstado(leitor.nextLine());
        dadosCadas += ","+pessoa.getEstado();

        System.out.print("Digite o Cep, somente números (ex. 09120163): ");
        pessoa.setCep(leitor.nextInt());
        dadosCadas += ","+pessoa.getCep();

        System.out.print("Digite o Numero, somente números: ");
        pessoa.setNumero(leitor.nextInt());
        dadosCadas += ","+pessoa.getNumero();

        System.out.println("Gravando os dados !!!");

        if (NewCadastro == 1) {
            String dadosCad = dadosCadas+dadosProf;
            gravaDadosProf(dadosCad);
        } if (NewCadastro == 2) {
            String dadosFornecedor = dadosForn+dadosCadas;
            gravaDadosForn(dadosFornecedor);
        } if (NewCadastro == 3) {
            String dadosAluno = dadosAlun+dadosCadas;
            gravaDadosAlu(dadosAluno);
        }

    }

    public void NewConsulta(String NewConsulta) throws FileNotFoundException {

        switch (NewConsulta) {
        case "ConProf":
            lerDados("professores.txt");
            break;

        case "ConForn":
            lerDados("fornecedores.txt");
            break;

        case "ConAlu":
            lerDados("alunos.txt");
            break;

        }

    }

    public static void lerDados(String nomeArquivo) throws FileNotFoundException {

        try (BufferedReader buffRead = new BufferedReader(new FileReader(nomeArquivo))) {

            String cab1 = buffRead.readLine();
            String linha = buffRead.readLine();

            if (linha != null) {
                int contaCad = 0;
                while (true) {

                    if (linha != null) {
                        contaCad++;
                        System.out.println("\n\n>>>CADASTRO---" + contaCad + "<<<\n");

                        String[] vect = linha.split(",");
                        String[] vectCab = cab1.split(",");

                        for (int i = 0; i < vect.length; i++) {
                            System.out.print(vectCab[i] + ": ");
                            System.out.println(vect[i]);
                        }

                    } else {
                        System.out.print("\n\n >>> O SISTEMA LISTOU " + contaCad + " CADASTRO <<<\n");
                        break;
                    }

                    linha = buffRead.readLine();
                }
            } else {
                System.out.println(
                        "\n\nO sistema não localizou dados cadastrados! \n \n Escolha outra opção no menu principal!\n");
            }
        } catch (IOException e) {
        }
    }

    public static void gravaDadosProf(String dados) {
        try {
            FileWriter flWrite = new FileWriter("professores.txt", true);
            flWrite.append(dados);
            flWrite.append(System.getProperty("line.separator"));
            flWrite.close();
            System.out.println("Os dados foram gravados com sucesso !!!");
        } catch (Exception e) {
            System.out.println("Ocorreu erro");
            e.printStackTrace();
        }
    }

    public static void gravaDadosForn(String dados) {
        try {
            FileWriter flWrite = new FileWriter("fornecedores.txt", true);
            flWrite.append(dados);
            flWrite.append(System.getProperty("line.separator"));
            flWrite.close();
            System.out.println("Os dados foram gravados com sucesso !!!");
        } catch (Exception e) {
            System.out.println("Ocorreu erro");
            e.printStackTrace();
        }
    }

    public static void gravaDadosAlu(String dados) {
        try {
            FileWriter flWrite = new FileWriter("alunos.txt", true);
            flWrite.append(dados);
            flWrite.append(System.getProperty("line.separator"));
            flWrite.close();
            System.out.println("Os dados foram gravados com sucesso !!!");
        } catch (Exception e) {
            System.out.println("Ocorreu erro");
            e.printStackTrace();
        }
    }
}
