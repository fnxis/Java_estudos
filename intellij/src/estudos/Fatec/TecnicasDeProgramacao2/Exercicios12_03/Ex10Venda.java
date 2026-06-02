package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Ex10Venda {
    int codigoProduto;
    double valorUnitario;
    int quantidade;

    public Ex10Venda(int codigoProduto, double valorUnitario, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return valorUnitario * quantidade;
    }

}
