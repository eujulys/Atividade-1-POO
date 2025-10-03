package Heranca.Exercicio2_3;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor("Empresa", "Av. Central", "9999-0000", 5000.0, 1200.0);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Endereço: " + f.getEndereco());
        System.out.println("Telefone: " + f.getTelefone());

        System.out.println("Crédito: R$" + f.getValorCredito());
        System.out.println("Dívida: R$" + f.getValorDivida());
        System.out.println("Saldo disponível: R$" + f.obterSaldo());

        f.setValorDivida(2500.0);
        System.out.println("Novo saldo após atualização da dívida: R$" + f.obterSaldo());
    }
}
