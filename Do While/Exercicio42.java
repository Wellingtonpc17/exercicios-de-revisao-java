import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPositivos = 0;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            }
        } while (numero >= 0);

        System.out.println("Quantidade de números positivos digitados: " + contadorPositivos);
        scanner.close();
    }
}
