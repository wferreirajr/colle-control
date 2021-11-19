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
        String[] options = {"1 - Cadastro", "2 - Consulta", "0 - Sair"};
        Scanner scanner = new Scanner(System.in);
        int option = 10;
        while (option!=0) {
            System.out.println("*************** Seja Bem Vindo!!! ***************");
            switch (option) {
                case 1: optCadastro(); break;
                case 2: optConsulta(); break;
                case 10: printMenu(options); break;
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

    //Opcoes
    private static void optCadastro() {
        System.out.println("Escolheu a opção CADASTRO");
    }
    private static void optConsulta() {
        System.out.println("Escolheu a opção CONSULTA");
    }
}
