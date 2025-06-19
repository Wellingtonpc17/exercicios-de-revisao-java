import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int pares = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores para a matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nQuantidade de números pares na matriz: " + pares);
        scanner.close();
    }
}
