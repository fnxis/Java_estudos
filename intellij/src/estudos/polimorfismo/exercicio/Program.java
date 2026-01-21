package estudos.polimorfismo.exercicio;
import estudos.polimorfismo.exercicio.entities.ImportedProduct;
import estudos.polimorfismo.exercicio.entities.Product;
import estudos.polimorfismo.exercicio.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.println("Digite o numero de produtos: ");
        int produtos = input.nextInt();

        for(int i=0;i<produtos;i++){
            System.out.println("Product #"+(i+1)+" data: ");
            System.out.println("Common, used or imported? (c/u/i)");
            char classe=input.next().charAt(0);
            System.out.println("Name: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Price: ");
            Double price = input.nextDouble();

            if (classe=='i') {
                System.out.println("Custom fee:");
                double fee = input.nextDouble();

                products.add(new ImportedProduct(nome, price, fee));

            } else if (classe == 'c') {
                products.add(new Product(nome, price));
            }else {
                System.out.println("Data de fabricação (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(nome, price,date));
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
    }
}
