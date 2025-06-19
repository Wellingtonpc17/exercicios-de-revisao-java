import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + ": " + notas[i]);
        }

        scanner.close();
    }
}
