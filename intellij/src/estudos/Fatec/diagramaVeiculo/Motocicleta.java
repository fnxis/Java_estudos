package estudos.Fatec.diagramaVeiculo;

public class Motocicleta extends Veiculo{


    @Override
    public void acelerar(Integer valor) {
        setVelocidade(valor);
        System.out.println("Motocicleta acelerou e esta a "+getVelocidade()+" KM");
    }

    @Override
    public void frear(Integer valor) {
        setVelocidade((valor));
        if (getVelocidade()<0){
            setVelocidade(0);
        }
        System.out.println("Motocicleta freou e esta a "+getVelocidade()+" KM");
    }

    @Override
    public Double desconto(Double valor) {
        return getPreco() - (getPreco()* (valor/100));
    }
}
