package estudos.Fatec.TecnicasDeProgramacao2.funcoes;

public class Pagamento {

    private Double saldoDevedor;
    private Integer parcela;
    private Double valorJuros;
    private Double valorParcela;
    private Double amortizacao;

    public Double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(Double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    public Double getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(Double valorJuros) {
        this.valorJuros = valorJuros;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Double getAmortizacao() {
        return amortizacao;
    }

    public void setAmortizacao(Double amortizacao) {
        this.amortizacao = amortizacao;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "saldoDevedor=" + saldoDevedor +
                ", parcela=" + parcela +
                ", valorJuros=" + valorJuros +
                ", valorParcela=" + valorParcela +
                ", amortizacao=" + amortizacao +
                '}';
    }
}
