package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Objects;

public class Questao5POO_Departamento {
    private String nome;
    private int codigo;

    public Questao5POO_Departamento(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Questao5POO_Departamento)) return false;
        Questao5POO_Departamento that = (Questao5POO_Departamento) o;
        return codigo == that.codigo &&
                Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
