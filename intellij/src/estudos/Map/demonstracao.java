package estudos.Map;

import java.util.HashMap;
import java.util.Map;

public class demonstracao {
    public static void main(String[] args) {

        Map<Product,Double> map = new HashMap<>();

        Product p1 = new Product("p1", 100.0);
        Product p2 = new Product("p2", 200.0);
        Product p3 = new Product("p3", 300.0);

        map.put(p1,1000.0);
        map.put(p2,2000.0);
        map.put(p3,3000.0);

        Product p4 = new Product("p1", 400.0);
        System.out.println("Contains 'p4' key: " + map.containsKey(p4));

    }
}
