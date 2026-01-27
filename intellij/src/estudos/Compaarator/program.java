package estudos.Compaarator;

import estudos.Compaarator.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        };

        Comparator<Product> comp2= (p1,p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()); // definindo uma funcao anonima

        products.sort(new MyComparator());//busca o comparator da classe MyComparator
        products.sort(comp); //busca o comparador na classe dentro do programa
        products.sort(comp2); // busca o comparador na funcao lambda
        products.sort((p1,p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));// colocar uma funcao lambda dentro de um metodo

        for (Product p : products) {
            System.out.println(p);
        }
    }


}
