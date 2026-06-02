package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex04ProdutoEstadual {

    protected String descricao;
    protected double valor;
    protected double imposto = 0.10;

    public Ex04ProdutoEstadual(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double calcularValorFinal() {
        return valor + (valor * imposto);
    }

    public void relatorio() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor Base: R$ " + valor);
        System.out.println("Imposto: 10%");
        System.out.println("Valor Final: R$ " + calcularValorFinal());
        System.out.println("---------------------------");
    }

}
