package estudos.Fatec.arquiteturas.observador;

public class EMAILObserver implements Observer {


    @Override
    public void processarVenda(Venda venda) {
        System.out.println("----------EMAIL----------");
        System.out.println("Send email to: "+venda.getCliente());
    }
}
