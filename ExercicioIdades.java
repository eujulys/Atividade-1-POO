public class ExercicioIdades {
    public static void main(String[] args) {
        int[] idades = {17, 25, 30, 16, 45, 18, 19, 22, 50, 14};
        
        System.out.println("Idades maiores que 18 anos:");
        for (int idade : idades) {

            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}