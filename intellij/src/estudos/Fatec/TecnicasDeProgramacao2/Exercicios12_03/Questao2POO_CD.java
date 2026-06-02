package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao2POO_CD extends Questao2POO_Midia {
    String artista;

    public Questao2POO_CD(String titulo, int ano, int codigo, String artista) {
        super(titulo, ano, codigo);
        this.artista = artista;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nCD:");
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Código: " + codigo);
        System.out.println("Artista: " + artista);
    }
}
