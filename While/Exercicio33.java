import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;

        System.out.print("Digite a senha: ");
        senha = scanner.nextLine();

        while (!senha.equals("1234")) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
        }

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close();
    }
}
