package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao2POO_DVD extends Questao2POO_Midia {

    String diretor;

    public Questao2POO_DVD(String titulo, int ano, int codigo, String diretor) {
        super(titulo, ano, codigo);
        this.diretor = diretor;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nDVD:");
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Código: " + codigo);
        System.out.println("Diretor: " + diretor);
    }
}
