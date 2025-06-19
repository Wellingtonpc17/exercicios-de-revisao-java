public class Exercicio3 {
    public static void main(String[] args) {
        int[] pares = new int[10];
        int valor = 2; 
        
        for (int i = 0; i < pares.length; i++) {
            pares[i] = valor;
            valor += 2;
        }
        
        System.out.println("Números pares de 2 a 20:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Posição " + i + ": " + pares[i]);
        }
    }
}
