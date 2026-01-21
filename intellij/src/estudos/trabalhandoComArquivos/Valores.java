package estudos.trabalhandoComArquivos;

public class Valores {

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Valores(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Double Calculo(double preco, int quantidade) {
        return preco * quantidade;
    }

    public String toString(){
        return nome+","+Calculo(preco,quantidade)+"\n";
    }
}
