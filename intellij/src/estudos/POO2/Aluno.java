package estudos.POO2;

import java.util.Random;

public class Aluno {
    String ra;
    String nome;
    String apelido;

    Random randomRandom = new Random();

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
        if (this.ra==null) {
            String ras=new Double(Math.random()*100).toString();
            this.ra= ras;
        }
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "apelido='" + apelido + '\'' +
                ", nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                '}';
    }
}
