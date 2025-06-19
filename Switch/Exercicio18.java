import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        String menu = "Escolha uma opção de conversão:\n" +
                      "1 - Quilômetros para Metros\n" +
                      "2 - Metros para Centímetros\n" +
                      "3 - Centímetros para Milímetros\n" +
                      "4 - Metros para Quilômetros\n" +
                      "5 - Sair";

        String opcaoStr = JOptionPane.showInputDialog(menu);
        int opcao = Integer.parseInt(opcaoStr);

        double valor, resultado;

        switch (opcao) {
            case 1:
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em quilômetros:"));
                resultado = valor * 1000;
                JOptionPane.showMessageDialog(null, valor + " km = " + resultado + " m");
                break;

            case 2:
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em metros:"));
                resultado = valor * 100;
                JOptionPane.showMessageDialog(null, valor + " m = " + resultado + " cm");
                break;

            case 3:
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em centímetros:"));
                resultado = valor * 10;
                JOptionPane.showMessageDialog(null, valor + " cm = " + resultado + " mm");
                break;

            case 4:
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em metros:"));
                resultado = valor / 1000;
                JOptionPane.showMessageDialog(null, valor + " m = " + resultado + " km");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
