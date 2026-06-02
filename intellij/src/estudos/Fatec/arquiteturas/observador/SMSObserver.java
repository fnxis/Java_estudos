package estudos.Fatec.arquiteturas.observador;

public class SMSObserver implements Observer {
    @Override
    public void processarVenda(Venda venda) {
        System.out.println("------------SMS------------");
        System.out.println("SMS Observer");
        System.out.println("Enviando SMS: "+venda.getCliente());
    }


}
