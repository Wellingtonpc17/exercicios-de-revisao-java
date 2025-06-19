import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numero = new int[5];

        for(int i = 0; i < numero.length; i++){
            System.out.println("DIGITE UM NUMERO PARA A POSIÇÃO: " + i);
            numero[i] = scanner.nextInt();
        }

        System.out.println("VALORES ARMAZENADOS NO VETOR");
        for(int i = 0; i < numero.length; i++){
            System.out.println("A posição " + i + " : " + numero[i] );
        }
        scanner.close();
    }
}