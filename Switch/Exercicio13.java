import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "BOA NOITE!");

        String entrada = JOptionPane.showInputDialog("Digite uma letra de A e Z");

        String resultado = "";

        switch (entrada) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                resultado = "vogal";
                break;
            default:
                JOptionPane.showMessageDialog(null, "A letra é uma consoante");
            break;
        }
        JOptionPane.showMessageDialog(null, "A letra é uma " + resultado);
    }
}