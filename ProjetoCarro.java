import java.util.Scanner;

public class ProjetoCarro {
    private String marca;
    private String modelo;
    private int ano;

    public ProjetoCarro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void MostrarInformações(ProjetoCarro carro){
        System.out.print("Seu carro:\n" + "Marca:" + carro.marca + "\n"
        + "Modelo:" + carro.modelo + "\n"
        + "Ano:" + carro.ano + "\n");
    }

    public void LigarCarro(ProjetoCarro carro){
        System.out.print("O Carro" + carro.modelo + " esta ligado!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProjetoCarro carro = new ProjetoCarro("Honda", "HRV", 2010);
        ProjetoCarro carro2 = new ProjetoCarro("Fiat", "Mob", 2020);

        System.out.print("Informações iniciais:\n");
        carro.MostrarInformações(carro);
        System.out.print("\n");
        carro2.MostrarInformações(carro2);
        System.out.print("\n");

        carro.LigarCarro(carro);
        System.out.print("\n");

        System.out.print("Digite uma nova marca");
        String marca = sc.nextLine();
        System.out.print("Digite um novo modelo");
        String modelo = sc.nextLine();
        System.out.print("Digite um novo ano");
        int ano = sc.nextInt();

        carro2.setMarca(marca);
        carro2.setModelo(modelo);
        carro2.setAno(ano);
        System.out.print("\n");
        
        carro2.MostrarInformações(carro2);
    }
}