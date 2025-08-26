public class DadosCliente {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Julio";
        cliente1.cpf = "999.999.999-99";
        cliente1.email = "juliolobato@gmail.com";
        
        cliente1.visualizarCadastro();
        
        cliente1.realizarCompra();
    }
}