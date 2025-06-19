import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidatos = {"João", "Maria", "Carlos"};
        int[] votos = new int[candidatos.length];
        int votosBranco = 0;
        int votosNulos = 0;

        int opcao;

        do {
            System.out.println("\n=== MENU DE VOTAÇÃO ===");
            System.out.println("1 - João");
            System.out.println("2 - Maria");
            System.out.println("3 - Carlos");
            System.out.println("4 - Voto em Branco");
            System.out.println("5 - Encerrar Votação");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    votos[opcao - 1]++;
                    System.out.println("Voto registrado para " + candidatos[opcao - 1]);
                    break;

                case 4:
                    votosBranco++;
                    System.out.println("Voto em branco registrado.");
                    break;

                case 5:
                    System.out.println("Encerrando votação...");
                    break;

                default:
                    votosNulos++;
                    System.out.println("Voto nulo registrado (opção inválida).");
            }

        } while (opcao != 5);

        System.out.println("\n=== APURAÇÃO FINAL ===");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " voto(s)");
        }
        System.out.println("Votos em branco: " + votosBranco);
        System.out.println("Votos nulos: " + votosNulos);

        scanner.close();
    }
}
