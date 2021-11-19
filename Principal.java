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
        Cadastro cad = new Cadastro();


        System.out.print("\033[H\033[2J");
        System.out.flush();
        String[] options = {
                
                "1  - Cadastro Professor",
                "2  - Cadastro Fornecedor",
                "3  - Cadastro Aluno", 
                "4  - Consulta Professor", 
                "5  - Consulta Fornecedor",
                "6  - Consulta Aluno", 
                "0  - Sair"
            };

            
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
                cad.optConsultaPfs();
                break;
            case 5:
                cad.optConsultaFncd();
                break;
            case 6:
                cad.optConsultaAln();
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
