import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double acumulador = 0;
        double valor;

        System.out.print("Digite um valor positivo (ou negativo para sair): ");
        valor = scanner.nextDouble();

        while (valor >= 0) {
            acumulador += valor;
            contador++;
            System.out.print("Digite outro valor positivo (ou negativo para sair): ");
            valor = scanner.nextDouble();
        }

        if (contador > 0) {
            double media = acumulador / contador;
            System.out.println("Média dos valores positivos digitados: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }

        scanner.close();
    }
}
