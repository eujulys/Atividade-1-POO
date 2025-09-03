package outrosExercicios;

public class Cliente {
    String nome;
    String cpf;
    String email;

    public void visualizarCadastro() { 
        System.out.println("Cadastro do outrosExercicios.Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("...");
    }
    public void realizarCompra() {
        System.out.println("O cliente " + nome + " está realizando uma compra.");
    }
}