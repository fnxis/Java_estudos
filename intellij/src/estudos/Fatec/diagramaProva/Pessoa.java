package estudos.Fatec.diagramaProva;

import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private String dataNascimento;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pessoa(String nome, String dataNascimento, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
