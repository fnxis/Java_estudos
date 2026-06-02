package estudos.Fatec.ex5;

public class NotificacaoObserver implements Observer {

    @Override
    public void processarPassagem(Passagem passagem) {
        System.out.println("Olha a mensagemmm");
    }
}
