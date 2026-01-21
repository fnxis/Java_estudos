package estudos.exercicios_encapsulamento_construtores;

public class OperacoesBancarias {
    private int numeroConta;
    private double saldo = 0;
    private String nome;

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public OperacoesBancarias(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double saque(double valor){
        return saldo-valor-5;
    }
}
