package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao2POO_Livro extends Questao2POO_Midia {
    String autor;

    public Questao2POO_Livro(String titulo, int ano, int codigo, String autor) {
        super(titulo, ano, codigo);
        this.autor = autor;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nLivro:");
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Código: " + codigo);
        System.out.println("Autor: " + autor);
    }
}
