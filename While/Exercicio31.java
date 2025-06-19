import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0;

        System.out.print("Digite um número (0 para sair): ");
        num = scanner.nextInt();

        while (num != 0) {
            soma += num;  
            System.out.print("Digite outro número (0 para sair): ");
            num = scanner.nextInt();
        }

        System.out.println("A soma dos números digitados é: " + soma);
        scanner.close();
    }
}
