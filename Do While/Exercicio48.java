import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Aluno: " + nome);
            System.out.printf("Média: %.2f\n", media);

            scanner.nextLine(); 
            System.out.print("Deseja cadastrar outro aluno? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}

