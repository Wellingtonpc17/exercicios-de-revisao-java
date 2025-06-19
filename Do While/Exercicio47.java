import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            tentativas++;

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                System.out.println("Senha incorreta.");
            }

        } while (tentativas < 3);

        if (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso bloqueado. Tentativas excedidas.");
        }

        scanner.close();
    }
}
