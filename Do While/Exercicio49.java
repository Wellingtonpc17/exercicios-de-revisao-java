import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginCorreto = "usuario123";
        String senhaCorreta = "senha123";
        String loginDigitado, senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Login: ");
            loginDigitado = scanner.nextLine();

            System.out.print("Senha: ");
            senhaDigitada = scanner.nextLine();

            tentativas++;

            if (loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Login efetuado com sucesso!");
                break;
            } else {
                System.out.println("Login ou senha incorretos.");
            }

        } while (tentativas < 3);

        if (!(loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta))) {
            System.out.println("Número máximo de tentativas atingido. Acesso bloqueado.");
        }

        scanner.close();
    }
}

