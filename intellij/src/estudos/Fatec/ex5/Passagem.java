package estudos.Fatec.ex5;

import java.time.LocalDate;

public class Passagem {

    private String tag;
    private String data;
    private String placa;
    private String codPegadio;
    private Double preco;
    private String nome;

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCodPegadio() {
        return codPegadio;
    }

    public void setCodPegadio(String codPegadio) {
        this.codPegadio = codPegadio;
    }
}
