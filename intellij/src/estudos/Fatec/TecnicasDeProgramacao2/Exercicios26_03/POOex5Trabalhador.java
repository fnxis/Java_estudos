package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

public class POOex5Trabalhador extends POOex5Pessoa {

    private double salario;

    public POOex5Trabalhador(String nome, double salario) {
        super(nome); // Chama o construtor da classe Pessoa
        this.salario = salario;
    }

    @Override
    public void reportar() {
        System.out.println("Nome:" + nome + " Salario: " + salario);
    }

}
