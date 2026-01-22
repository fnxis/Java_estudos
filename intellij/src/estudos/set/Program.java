package estudos.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<Product> set= new HashSet<>();

        set.add(new Product("TV",900.0));
        set.add(new Product("TV1",2900.0));
        set.add(new Product("TV2",1900.0));

        Product prod=new Product("TV1",2900.0);

        System.out.println(set.contains(prod));

    }
}
