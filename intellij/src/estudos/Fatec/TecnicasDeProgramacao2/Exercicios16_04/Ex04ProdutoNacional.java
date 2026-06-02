package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex04ProdutoNacional extends Ex04ProdutoEstadual{

    protected double taxa = 0.05;

    public Ex04ProdutoNacional(String descricao, double valor) {
        super(descricao, valor);
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() + (valor * taxa);
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Taxa Nacional: 5%");
    }

}
