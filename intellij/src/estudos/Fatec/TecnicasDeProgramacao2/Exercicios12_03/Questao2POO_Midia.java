package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public abstract class Questao2POO_Midia {

    String titulo;
    int anoLancamento;
    int codigo;

    public Questao2POO_Midia(String titulo, int anoLancamento, int codigo) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.codigo = codigo;
    }

    public abstract void exibirDados();

}
