import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int num = scanner.nextInt();

        long fatorial = 1;

        for (int i = num; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + num + " é: " + fatorial);

        scanner.close();
    }
}
