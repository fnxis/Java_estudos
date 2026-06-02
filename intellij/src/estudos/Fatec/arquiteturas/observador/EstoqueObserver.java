package estudos.Fatec.arquiteturas.observador;

public class EstoqueObserver implements Observer {


    @Override
    public void processarVenda(Venda venda) {
        System.out.println("------------EstoqueObserver----------");
        System.out.println(venda.getCliente());
    }
}
