package estudos.varArgs;

public class Class {
    public static void main(String[] args) {
        System.out.println(somar(4,5,2,3,5,6,7,8));
        Integer numeros[]={2,5,6,7};

        System.out.println("Soma array");
        System.out.println(somar(numeros));

    }
    public static Integer somar(Integer ... n){
        Integer somar=0;
        for (Integer i:n){
            somar+=i;
        }
        return somar;

    }

}
