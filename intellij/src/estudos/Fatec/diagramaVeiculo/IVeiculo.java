package estudos.Fatec.diagramaVeiculo;

public interface IVeiculo {
    public void acelerar(Integer valor);
    public void frear(Integer valor);
    public void ligar();
    public void desligar();
    public Double desconto(Double valor);
}
