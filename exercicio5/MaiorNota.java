package exercicio5;

import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        double[] notas = new double[10];

        Scanner entrada = new Scanner(System.in);

        double maiorNota = Double.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("A maior nota é: " + maiorNota);

        entrada.close();
    }
}