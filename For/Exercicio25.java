import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;  

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número digitado é: " + maior);
        scanner.close();
    }
}
