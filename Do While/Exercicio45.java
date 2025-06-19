import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        double total = 0;
        String continuar;

        do {
            System.out.print("Digite o valor da compra: R$ ");
            valor = scanner.nextDouble();
            total += valor;

            System.out.print("Deseja adicionar outra compra? (s/n): ");
            scanner.nextLine(); 
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.printf("Total da compra: R$ %.2f\n", total);
        scanner.close();
    }
}
