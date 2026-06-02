package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao3POO_Pessoa {
    private String nome;
    private String dataNascimento;
    private Questao3POO_Universidade universidade;

    public Questao3POO_Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void associarUniversidade(Questao3POO_Universidade u) {
        this.universidade = u;
    }

    public void informarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + dataNascimento);

        if (universidade != null) {
            System.out.println("Trabalha na universidade: " + universidade.getNome());
        } else {
            System.out.println("Sem universidade associada.");
        }
    }
}
