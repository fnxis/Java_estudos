package estudos.application;

import estudos.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.println("Enter product data:");
        System.out.print("Product name: ");
        String name=sc.nextLine();
        System.out.print("Product price: ");
        double price=sc.nextDouble();
        System.out.print("Product quantity: ");
        int quantity=sc.nextInt();
        Product product = new Product(price,name,quantity);
        System.out.println("Product data: " + product.toString());
        System.out.print("Enter the number of products to be added in stock: ");

        quantity=sc.nextInt();

        product.addProducts(quantity);

        System.out.println("Update data: " + product.toString());
        System.out.print("Enter the number of products to be removed in stock: ");

        quantity=sc.nextInt();

        product.removeProducts(quantity);

        System.out.println("Update data: " + product.toString());


        sc.close();
    }
}
