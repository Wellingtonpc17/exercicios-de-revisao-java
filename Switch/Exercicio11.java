import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "BOA NOITE!");

        String entrada = JOptionPane.showInputDialog("DIGITE UM NUMERO DE 1 A 3");
        int numero = Integer.parseInt(entrada);

        String dia = "";

        switch (numero) {
            case 1:
                dia = "DOMINGO";
                break;
                case 2:
                dia = "SEGUNDA";
                break;
                case 3:
                dia = "TERÇA";
                break;
            default:
            JOptionPane.showMessageDialog(null, "NÃO ESTA DENTRO DO INTERVALO");
                break;
        }
        JOptionPane.showMessageDialog(null, "O DIA DA SEMANA É " + dia);
    }
}