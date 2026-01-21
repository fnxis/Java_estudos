package estudos.Generics;

public class Products implements Comparable<Products>{
    private String nome;
    private Double preco;

    @Override
    public String toString() {
        return "Products{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Products(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Products o) {
        return preco.compareTo(o.getPreco());
    }
}
