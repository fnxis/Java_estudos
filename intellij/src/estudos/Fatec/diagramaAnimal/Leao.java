package estudos.Fatec.diagramaAnimal;

public class Leao extends Animal {

    private boolean juba;

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar(){
        System.out.println("O leao "+ getJuba()+" saiu pra caçar!");
    }

    public String getJuba(){
        if (isJuba()){
            return "Com juba";
        }
        else {
            return "Sem Juba";
        }
    }


}
