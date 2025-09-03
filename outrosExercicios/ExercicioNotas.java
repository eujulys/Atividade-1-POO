package outrosExercicios;

public class ExercicioNotas {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.5, 6.0};
        double soma = 0.0;
        for (double nota : notas) { 
            soma = soma + nota; 
        }
        double media = soma / notas.length;

        System.out.printf("A média aritmética das notas é: %.2f%n", media);
    }
}