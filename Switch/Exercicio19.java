import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO_MAXIMO = 100;
        String[] nomes = new String[TAMANHO_MAXIMO];
        String[] emails = new String[TAMANHO_MAXIMO];
        String[] telefones = new String[TAMANHO_MAXIMO];
        int totalClientes = 0;

        int opcao;

        do {
            
            System.out.println("\n=== MENU CADASTRO DE CLIENTES ===");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Editar cliente");
            System.out.println("4 - Excluir cliente");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (totalClientes < TAMANHO_MAXIMO) {
                        System.out.print("Nome: ");
                        nomes[totalClientes] = scanner.nextLine();

                        System.out.print("Email: ");
                        emails[totalClientes] = scanner.nextLine();

                        System.out.print("Telefone: ");
                        telefones[totalClientes] = scanner.nextLine();

                        totalClientes++;
                        System.out.println("Cliente cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de clientes atingido.");
                    }
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE CLIENTES ===");
                    if (totalClientes == 0) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (int i = 0; i < totalClientes; i++) {
                            System.out.println((i + 1) + " - " + nomes[i] + " | " + emails[i] + " | " + telefones[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do cliente para editar: ");
                    int editar = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    if (editar >= 0 && editar < totalClientes) {
                        System.out.print("Novo nome: ");
                        nomes[editar] = scanner.nextLine();

                        System.out.print("Novo email: ");
                        emails[editar] = scanner.nextLine();

                        System.out.print("Novo telefone: ");
                        telefones[editar] = scanner.nextLine();

                        System.out.println("Cliente atualizado com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número do cliente para excluir: ");
                    int excluir = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    if (excluir >= 0 && excluir < totalClientes) {
                        for (int i = excluir; i < totalClientes - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            emails[i] = emails[i + 1];
                            telefones[i] = telefones[i + 1];
                        }
                        totalClientes--;
                        System.out.println("Cliente excluído com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
