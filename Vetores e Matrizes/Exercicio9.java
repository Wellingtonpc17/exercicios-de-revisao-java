import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int maiorValor = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMatriz informada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("Posição: linha " + linhaMaior + ", coluna " + colunaMaior);

        scanner.close();
    }
}
