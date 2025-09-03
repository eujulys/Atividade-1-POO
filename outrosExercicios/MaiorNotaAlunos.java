package outrosExercicios;

import java.util.Scanner;

public class MaiorNotaAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[10];
        
        System.out.println("Digite a nota de 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble(); 
        }
        double maiorNota = notas[0];
        
        for (int i = 1; i < notas.length; i++) {            
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        System.out.println("\nA maior nota digitada foi: " + maiorNota);
        scanner.close();
    }
}