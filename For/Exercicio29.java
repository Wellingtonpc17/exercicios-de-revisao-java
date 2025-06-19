import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int contadorDivisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contadorDivisores++;
            }
        }

        if (contadorDivisores == 2) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        scanner.close();
    }
}
