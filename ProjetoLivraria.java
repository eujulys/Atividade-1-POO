import java.util.Scanner;

public class ProjetoLivraria {
    private String titulo;
    private int numeroDePaginas;
    private int anoDePublicacao;
    private double preco;

    public ProjetoLivraria(String titulo, int numeroDePaginas, int anoDePublicacao, double preco) {
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void AlterarLivro(ProjetoLivraria livro){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um novo titulo");
        String titulo = sc.nextLine();
        System.out.print("Digite um numero de paginas");
        int numeroDePaginas = sc.nextInt();
        System.out.print("Digite um novo ano de publicação");
        int anoDePublicacao = sc.nextInt();
        System.out.print("Digite um novo preço");
        double preco = sc.nextInt();

        livro.setTitulo(titulo);
        livro.setNumeroDePaginas(numeroDePaginas);
        livro.setAnoDePublicacao(anoDePublicacao);
        livro.setPreco(preco);
    }

    public void MostrarInfo(ProjetoLivraria livro){
        System.out.println("\nTítulo: " + livro.titulo);
        System.out.println("Número de páginas: " + livro.numeroDePaginas);
        System.out.println("Ano de publicação: " + livro.anoDePublicacao);
        System.out.println("Preço: R$" + livro.preco + "\n");
    }

    public static void main(String[] args) {
        ProjetoLivraria livro = new ProjetoLivraria("Hermann Hesse", 193, 2025, 25);
        ProjetoLivraria livro2 = new ProjetoLivraria("Dom Casmurro", 200, 2000, 50);

        livro.MostrarInfo(livro);
        livro2.MostrarInfo(livro2);

        livro.AlterarLivro(livro);
        livro.MostrarInfo(livro);
    }
}