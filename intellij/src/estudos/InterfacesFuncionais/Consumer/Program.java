package estudos.InterfacesFuncionais.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 500.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Tablet", 350.0));
        products.add(new Product("HD", 80.90));

        Consumer<Product> cons= p -> p.setPrice(p.getPrice()*1.1);

        products.forEach(new PriceUpdate());// atualiza os precos com a classe PriceUpdate
        products.forEach(Product::staticPriceUpdate);// atualiza o preco com um metodo statico no objeto
        products.forEach(Product::nonStaticPriceUpdate);//atualiza o preco com um metodo nao statico no objeto
        products.forEach(cons);// atualiza o preco com uma implementacao do consumer no programa
        products.forEach(p -> p.setPrice(p.getPrice()*1.1));// atualiza o preco com a expressao lambda

        products.forEach(System.out::println);// um for que passa por todas as partes da lista

    }
}
