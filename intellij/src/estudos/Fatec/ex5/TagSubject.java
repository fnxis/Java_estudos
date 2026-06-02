package estudos.Fatec.ex5;

import java.util.ArrayList;
import java.util.List;

public class TagSubject implements Subject {

    List<estudos.Fatec.ex5.Observer> observers = new ArrayList<>();

    private Passagem passagem;
    List<Passagem> passagens = new ArrayList<>();
    public void Pedagio(Passagem passagem){
        this.passagem = passagem;
        this.notifyObservers();
        this.passagens.add(passagem);
    }

    @Override
    public void register(estudos.Fatec.ex5.Observer o) {
        this.observers.add(o);

    }

    @Override
    public void unregister(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (estudos.Fatec.ex5.Observer o : observers) {
            o.processarPassagem(passagem);
        }
    }

    public void listar(){
        System.out.printf(
                "%-15s %-12s %-10s %-10s %-10s %-10s%n",
                "Cliente",
                "Data",
                "Tag",
                "Placa",
                "Praça",
                "Valor"
        );
        for (Passagem p : passagens) {
            System.out.printf(
                    "%-15s %-12s %-10s %-10s %-10s %-10.2f%n",
                    p.getNome(),
                    p.getData(),
                    p.getTag(),
                    p.getPlaca(),
                    p.getCodPegadio(),
                    p.getPreco()
            );
        }
    }


}
