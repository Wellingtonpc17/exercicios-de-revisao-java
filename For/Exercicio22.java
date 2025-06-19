import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();
            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
