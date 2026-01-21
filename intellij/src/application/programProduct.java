package application;

import entities.product;
import java.util.Locale;
import java.util.Scanner;

public class programProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        product product = new product();

        System.out.println("Enter product data:");
        System.out.print("Product name: ");
        product.name=sc.nextLine();
        System.out.print("Product price: ");
        product.price=sc.nextDouble();
        System.out.print("Product quantity: ");
        product.quantity=sc.nextInt();

        System.out.println("Product data: " + product.toString());
        System.out.print("Enter the number of products to be added in stock: ");

        int quantity=sc.nextInt();

        product.addProducts(quantity);

        System.out.println("Update data: " + product.toString());
        System.out.print("Enter the number of products to be removed in stock: ");

        quantity=sc.nextInt();

        product.removeProducts(quantity);

        System.out.println("Update data: " + product.toString());


        sc.close();
    }
}
