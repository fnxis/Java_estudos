package estudos.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparableTreeSet {
    public static void main(String[] args) {
        Set<Product> set= new TreeSet<>();

        set.add(new Product("TV",900.0));
        set.add(new Product("TV2",1900.0));
        set.add(new Product("TV1",2900.0));

        for (Product p:set){
            System.out.println(p);
        }

    }
}
