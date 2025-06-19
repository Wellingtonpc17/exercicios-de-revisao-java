import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        double saldo = 1000.0; 

        String menu = "Caixa Eletrônico\n" +
                      "1 - Saldo\n" +
                      "2 - Saque\n" +
                      "3 - Depósito\n" +
                      "Escolha uma opção:";

        String opcaoStr = JOptionPane.showInputDialog(menu);
        if (opcaoStr == null) {
            JOptionPane.showMessageDialog(null, "Programa encerrado.");
        } else {
            int opcao = Integer.parseInt(opcaoStr); 

            switch (opcao) {
                case 1: 
                    JOptionPane.showMessageDialog(null, "Seu saldo é: R$ " + String.format("%.2f", saldo));
                    break;

                case 2: 
                    String saqueStr = JOptionPane.showInputDialog("Digite o valor para saque:");
                    if (saqueStr == null) {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                    } else {
                        double saque = Double.parseDouble(saqueStr); 
                        if (saque <= 0) {
                            JOptionPane.showMessageDialog(null, "Valor inválido para saque!");
                        } else if (saque > saldo) {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                        } else {
                            saldo -= saque;
                            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Novo saldo: R$ " + String.format("%.2f", saldo));
                        }
                    }
                    break;

                case 3: 
                    String depositoStr = JOptionPane.showInputDialog("Digite o valor para depósito:");
                    if (depositoStr == null) {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                    } else {
                        double deposito = Double.parseDouble(depositoStr); 
                        if (deposito <= 0) {
                            JOptionPane.showMessageDialog(null, "Valor inválido para depósito!");
                        } else {
                            saldo += deposito;
                            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso! Novo saldo: R$ " + String.format("%.2f", saldo));
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
