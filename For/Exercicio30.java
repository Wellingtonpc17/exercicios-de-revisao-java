import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números da sequência de Fibonacci deseja gerar: ");
        int N = scanner.nextInt();

        int a = 0, b = 1, proximo;

        System.out.println("Sequência de Fibonacci:");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");

            proximo = a + b;
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}
