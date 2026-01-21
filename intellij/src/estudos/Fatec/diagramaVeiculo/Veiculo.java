package estudos.Fatec.diagramaVeiculo;

public abstract class Veiculo implements IVeiculo{
    private Integer velocidade;
    private String placa;
    private String chassi;
    private Integer ano;
    private Double preco;

    public static double calcularValorVenda(Veiculo v){
        return v.getPreco() * 0.9;
    }
    @Override
    public void ligar(){
        System.out.println("Veiculo ligado");
    }
    @Override
    public void desligar(){
        System.out.println("Veiculo desligado");
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
