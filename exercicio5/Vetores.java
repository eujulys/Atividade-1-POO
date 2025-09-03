package exercicio5;

public class Vetores {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Os valores pares no vetor são:");

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}