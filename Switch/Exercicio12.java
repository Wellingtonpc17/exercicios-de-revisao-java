import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "BOA NOITE!");

        String entrada = JOptionPane.showInputDialog("DIGITE UM NUMERO DE 1 A 7");
        int numero = Integer.parseInt(entrada);

        String dia = "";

        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
                case 2:
                dia = "Segunda-Feira";
                break;
                case 3:
                dia = "Terça-Feira";
                break;
                case 4:
                dia = "Quarta-Feira";
                break;
                case 5:
                dia = "Quinta-Feira";
                break;
                case 6:
                dia = "Sexta-Feira";
                break;
                case 7:
                dia = "Sabado";
                break;
                default:
                JOptionPane.showMessageDialog(null, "Número Inválido");
                break;
        }
        JOptionPane.showMessageDialog(null, "O dia da semana é " + dia);
    }
}