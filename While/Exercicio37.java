import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota;
        double soma = 0;
        int contador = 0;

        System.out.print("Digite uma nota entre 0 e 10 (ou uma nota inválida para sair): ");
        nota = scanner.nextDouble();

        while (nota >= 0 && nota <= 10) {
            soma += nota;
            contador++;

            System.out.print("Digite outra nota (ou uma nota inválida para sair): ");
            nota = scanner.nextDouble();
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        scanner.close();
    }
}
