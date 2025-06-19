import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial para o contador regressivo: ");
        int i = scanner.nextInt();

        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("Contagem regressiva finalizada!");
        scanner.close();
    }
}
