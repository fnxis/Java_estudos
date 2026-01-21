package estudos.Fatec.diagramaVeiculo;

public class Automovel extends Veiculo {
    private String cor;

    @Override
    public void acelerar(Integer valor) {
        setVelocidade(valor);
        System.out.println("Automovel acelerou e esta a "+getVelocidade()+" KM");
    }

    @Override
    public void frear(Integer valor) {
        setVelocidade(valor);
        if (getVelocidade()<0){
            setVelocidade(0);
        }
        System.out.println("Automovel freou e esta a "+getVelocidade()+" KM");
    }

    @Override
    public Double desconto(Double valor) {
        return getPreco() - (getPreco()* (valor/100))-100;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
