package estudos.InterfacesFuncionais.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 500.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Tablet", 350.0));
        products.add(new Product("HD", 80.90));

        Function<Product,String> funct= p-> p.getName().toUpperCase();

        List<String> names1=products.stream().map(new UpperCaseName()).collect(Collectors.toList());// gera em caixa alta o nome por uma classe Function
        List<String> names2=products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());// gera em caixa alta o nome pelo metodo statico no objeto Product
        List<String> names3=products.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());// gera em caixa alta o nome pelo metodo nao statico no objeto Product
        List<String> names4=products.stream().map(funct).collect(Collectors.toList());// gera em caixa alta o nome por uma instancia da classe function
        List<String> names5=products.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());// gera em caixa alta o nome direto pela expressao lambda



        names1.forEach(System.out::println);// um for que passa por todas as partes da lista
        System.out.println("-----------------------------------------------");
        names2.forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        names3.forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        names4.forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        names5.forEach(System.out::println);
        System.out.println("-----------------------------------------------");


    }
}
