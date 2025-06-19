import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine().toLowerCase();

        switch (produto) {
            case "arroz":
            case "feijão":
            case "macarrão":
                System.out.println("Categoria: Alimentos");
                break;

            case "detergente":
            case "sabão":
            case "desinfetante":
                System.out.println("Categoria: Produtos de limpeza");
                break;

            case "shampoo":
            case "sabonete":
            case "creme dental":
                System.out.println("Categoria: Higiene pessoal");
                break;

            default:
                System.out.println("Categoria: Produto não categorizado.");
        }

        scanner.close();
    }
}
