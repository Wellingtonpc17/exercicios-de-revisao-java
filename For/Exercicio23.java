public class Exercicio23 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números pares entre 1 e 50: " + contador);
    }
}
