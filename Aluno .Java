import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private double notaAv1;
    private double notaAv2;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2){
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarAprovacao());
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2.0;
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Roberto", 123, 7, 8);
        Aluno aluno2 = new Aluno("Juliana", 456, 3, 6);

        System.out.print("Alunos: \n");
        aluno1.mostrarDados();
        System.out.print("\n");
        aluno2.mostrarDados();
        System.out.print("\n");

        System.out.print("Digite a nota da primeira avaliação: ");
        double notaAv1 = sc.nextDouble();
        aluno1.setNotaAv1(notaAv1);

        System.out.print("Digite a nota da segunda avaliação: ");
        double notaAv2 = sc.nextDouble();
        aluno1.setNotaAv2(notaAv2);

        System.out.print("Aluno 1 atualizado: ");
        aluno1.mostrarDados();

        sc.close();
    }
}