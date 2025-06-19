import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite nomes (digite 'fim' para encerrar):");

        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.println("Nome digitado: " + nome);
            }

        } while (!nome.equalsIgnoreCase("fim"));

        scanner.close();
        System.out.println("Encerrado.");
    }
}
