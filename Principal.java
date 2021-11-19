import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Escolha a opção desejada: ");
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String[] options = { "1  - Cadastro Pessoa Física", "2  - Cadastro Pessoal Jurídica", "3  - Cadastro Professor",
                "4  - Cadastro Fornecedor", "5  - Cadastro Aluno", "6  - Consulta Pessoa Física",
                "7  - Consulta Pessoal Jurídica", "8  - Consulta Professor", "9  - Consulta Fornecedor",
                "10 - Consulta Aluno", "0  - Sair" };
        Scanner scanner = new Scanner(System.in);
        int option = 50;
        while (option != 0) {
            System.out.println("*************** Seja Bem Vindo!!! ***************");
            switch (option) {
            case 1:
                optCadastroPF();
                break;
            case 2:
                optCadastroPJ();
                break;
            case 3:
                optCadastroPfs();
                break;
            case 4:
                optCadastroFncd();
                break;
            case 5:
                optCadastroAln();
                break;
            case 6:
                optConsultaPF();
                break;
            case 7:
                optConsultaPJ();
                break;
            case 8:
                optConsultaPfs();
                break;
            case 9:
                optConsultaFncd();
                break;
            case 10:
                optConsultaAln();
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

    // Opcoes
    private static void optCadastroPF() {
        System.out.println("Escolheu a opção CADASTRO!");
    }

    private static void optCadastroPJ() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optCadastroPfs() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optCadastroFncd() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optCadastroAln() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optConsultaPF() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optConsultaPJ() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optConsultaPfs() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optConsultaFncd() {
        System.out.println("Escolheu a opção CONSULTA");
    }

    private static void optConsultaAln() {
        System.out.println("Escolheu a opção CONSULTA");
    }

}
