package estudos.Fatec.arquiteturas.observador;

import java.util.ArrayList;
import java.util.List;

public class VendaSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private Venda venda;

    public void updateVenda(Venda venda) {
        this.venda = venda;
        this.notifyObservers();
    }


    @Override
    public void register(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.processarVenda(venda);
        }
    }
}
