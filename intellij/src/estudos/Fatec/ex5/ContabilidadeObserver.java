package estudos.Fatec.ex5;

public class ContabilidadeObserver implements Observer {

    @Override
    public void processarPassagem(Passagem passagem) {
        System.out.println("Enviado para a contabilidade \n");
    }
}
