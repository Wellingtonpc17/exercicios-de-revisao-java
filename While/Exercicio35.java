import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int soma = 0;
        int contador = 0;

        System.out.print("Digite a idade (-1 para sair): ");
        idade = scanner.nextInt();

        while (idade != -1) {
            soma += idade;
            contador++;

            System.out.print("Digite a idade (-1 para sair): ");
            idade = scanner.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média das idades digitadas é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi digitada.");
        }

        scanner.close();
    }
}
