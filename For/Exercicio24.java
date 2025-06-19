import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nNomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
