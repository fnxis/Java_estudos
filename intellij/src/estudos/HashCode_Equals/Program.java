package estudos.HashCode_Equals;

public class Program {
    public static void main(String[] args) {
        Client c1=new Client("Maria","Maria@gmail.com");
        Client c2=new Client("Alex","alex@gmail.com");
        Client c3=new Client("Maria","Maria@gmail.com");
        Client c4=new Client("Maria","Mariazinha@gmail.com");

        String s1="Test";
        String s2="Test";

        /* compara os caracteres*/
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c1.equals(c3));


        System.out.println(c1==c3);/* compara a posicao da memoria pois ele e um objeto*/
        System.out.println(s1==s2);/* a expressao e tratada especial para literais*/
    }
}
