package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

public class POOex5Estudante extends POOex5Pessoa{

    private int idade;

    public POOex5Estudante(String nome, int idade) {
        super(nome); // Chama o construtor da classe Pessoa
        this.idade = idade;
    }

    @Override
    public void reportar() {
        System.out.println("Nome:" + nome + " Idade: " + idade);
    }

}
