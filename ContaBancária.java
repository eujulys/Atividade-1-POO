import java.util.Scanner;

public class ContaBancária {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancária(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(ContaBancária conta){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do deposito");
        int saldo = sc.nextInt();

        conta.setSaldo(conta.saldo + saldo);
        System.out.print("Seu saldo é R$" + conta.saldo);
    }

    public void sacar(ContaBancária conta){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de retirada");
        int saldo = sc.nextInt();

        conta.setSaldo(conta.saldo - saldo);
        System.out.print("Seu saldo é R$" + conta.saldo);
    }

    public void saldo(ContaBancária conta){
        System.out.print("Seu saldo é R$" + conta.saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancária conta = new ContaBancária("123", "João", 100);

        System.out.print("Digite o dígito referente operação que deseja realizar: \n1 - Depósito\n2 - Sacar\n3 - Saldo\n");
        int operacao = sc.nextInt();

        if(operacao == 1){
            conta.depositar(conta);
        }else if(operacao == 2){
            conta.sacar(conta);
        }else if(operacao == 3){
            conta.saldo(conta);
        }
    }
}