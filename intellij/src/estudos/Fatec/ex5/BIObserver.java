package estudos.Fatec.ex5;

public class BIObserver implements Observer {

    @Override
    public void processarPassagem(Passagem passagem) {
        System.out.println("Enviado para o BI");
    }
}
