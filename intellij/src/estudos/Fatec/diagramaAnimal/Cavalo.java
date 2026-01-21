package estudos.Fatec.diagramaAnimal;

public class Cavalo extends Animal{

    private String raca;


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void fugir(){
        System.out.println("O cavalo da raça "+ getRaca()+ " Fugiu");
    }

}
