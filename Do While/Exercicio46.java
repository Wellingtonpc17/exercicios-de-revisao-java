import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 42; 
        int palpite;

        System.out.println("Tente adivinhar o número secreto (entre 1 e 100):");

        do {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }

        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
