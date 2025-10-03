package Heranca.Exercicio1;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(String novoSetor) {
        setor = novoSetor;
    }
}
