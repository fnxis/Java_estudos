package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex04ProdutoImportado extends Ex04ProdutoNacional{

    private double taxaImportacao = 0.05;

    public Ex04ProdutoImportado(String descricao, double valor) {
        super(descricao, valor);
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() + (valor * taxaImportacao);
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Taxa Importação: 5%");
    }

}
