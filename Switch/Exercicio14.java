import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Boa noite!");

        String entrada = JOptionPane.showInputDialog("DIGITE O NUMERO DO MES DE 1 A 12");
        int numero = Integer.parseInt(entrada);

        String resultado = "";

        switch (numero) {
            case 1:
                resultado = "Janeiro";
            break;
            case 2:
                resultado = "Fevereiro";
            break;
            case 3:
                resultado = "Março";
            break;
            case 4:
                resultado = "Abril";
            break;
            case 5:
                resultado = "Maio";
            break;
            case 6:
                resultado = "Junho";
            break;
            case 7:
                resultado = "Julho";
            break;
            case 8:
                resultado = "Agosto";
            break;
            case 9:
                resultado = "Setembro";
            break;
            case 10:
                resultado = "Outubro";
            break;
            case 11:
                resultado = "Novembro";
            break;
            case 12:
                resultado = "Dezembro";
            break;
            default:
            JOptionPane.showMessageDialog(null, "Número Inválido");
            break;
        }
        JOptionPane.showMessageDialog(null, "O mês é " + resultado);
    }
}