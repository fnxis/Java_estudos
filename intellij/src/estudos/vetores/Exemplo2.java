package estudos.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n =sc.nextInt();

        Product[] p = new Product[n];

        for (int i=0;i<p.length;i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            p[i]=new Product(name,price);
        }
        double sum=0.0;
        for (int i=0;i<p.length;i++){
            sum+=p[i].getPrice();
        }
        double media=sum/p.length;
        System.out.printf("MEDIA = %.2f\n",media);

        sc.close();
    }
}
