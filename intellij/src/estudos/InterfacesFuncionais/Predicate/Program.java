package estudos.InterfacesFuncionais.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 500.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Tablet", 350.0));
        products.add(new Product("HD", 80.90));

        Predicate<Product> pred= p -> p.getPrice()>=100.0;

        products.removeIf(new ProductPredicate());// busca na classe ProductPredicate
        products.removeIf(Product::staticProductPredicate);//busca um metodo statico dentro do objeto
        products.removeIf(Product::nonStaticproductPredicate);// busca um metodo nao estatico dentro do objeto
        products.removeIf(pred);// busca a implementacao no codigo
        products.removeIf(p -> p.getPrice()>=100.0);// faz a implementacao como expressao lambda direto no remove


        for (Product p : products) System.out.println(p);

    }

}
