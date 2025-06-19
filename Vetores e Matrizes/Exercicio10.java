import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        boolean simetrica = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }

        System.out.println("\nMatriz informada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        if (simetrica) {
            System.out.println("\nA matriz é simétrica.");
        } else {
            System.out.println("\nA matriz NÃO é simétrica.");
        }

        scanner.close();
    }
}
