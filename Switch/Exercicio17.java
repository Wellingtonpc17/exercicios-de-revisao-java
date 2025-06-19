import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        String operador = JOptionPane.showInputDialog("Digite o operador (+, -, *, /):");

        double resultado;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;

            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operador inválido.");
        }
    }
}
