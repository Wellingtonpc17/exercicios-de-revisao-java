import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] soma = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + i + " do vetor 1: ");
            vetor1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + i + " do vetor 2: ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor soma:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + soma[i]);
        }

        scanner.close();
    }
}
