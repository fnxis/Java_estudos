package estudos.Fatec.ex5;

public interface Subject {

    public void register(estudos.Fatec.ex5.Observer o);

    public void unregister(Observer o);

    public void notifyObservers();

}

