package estudos.Fatec.arquiteturas.observador;

public class Main {
    public static void main(String[] args) {

        VendaSubject vendaSubject = new VendaSubject();

        Observer email = new EMAILObserver();
        Observer sms = new SMSObserver();
        Observer estoque = new EstoqueObserver();


        vendaSubject.register(email);
        vendaSubject.register(sms);
        vendaSubject.register(estoque);

        Venda venda = new Venda();
        venda.setCliente("Joao");
        venda.setValor(129.00);

        Venda venda2 = new Venda();

        venda2.setCliente("Maria");
        venda2.setValor(329.00);

        vendaSubject.updateVenda(venda);
        vendaSubject.updateVenda(venda2 );

    }
}
