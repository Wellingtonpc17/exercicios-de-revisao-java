import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "admin";
        String senhaCorreta = "1234";

        String login = "";
        String senha = "";

        while (!login.equals(loginCorreto) || !senha.equals(senhaCorreta)) {
            System.out.print("Digite o login: ");
            login = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (!login.equals(loginCorreto) || !senha.equals(senhaCorreta)) {
                System.out.println("Login ou senha incorretos. Tente novamente.\n");
            }
        }

        System.out.println("Acesso concedido!");
        scanner.close();
    }
}
