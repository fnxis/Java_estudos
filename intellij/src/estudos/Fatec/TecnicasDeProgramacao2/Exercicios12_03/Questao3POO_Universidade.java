package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao3POO_Universidade {
    private String nome;

    public Questao3POO_Universidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void informarNome() {
        System.out.println("Universidade: " + nome);
    }
}
