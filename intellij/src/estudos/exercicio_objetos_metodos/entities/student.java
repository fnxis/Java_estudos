package estudos.exercicio_objetos_metodos.entities;

public class student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double totalPoints(){
        return nota1 + nota2 + nota3;
    }
    public double missingPoints(){
        return 60-totalPoints();
    }
    public String situation(){
        if (totalPoints() >= 60){
            return "PASS";
        }
        return "FAILED";
    }
    public String toString(){
        return "FINAL GRADE = " + totalPoints();
    }
}
