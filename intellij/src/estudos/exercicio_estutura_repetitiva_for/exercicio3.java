package exercicio_estutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quant;

        double a,b,c,media;

        quant = sc.nextInt();

        for(int i=0;1<=quant;i++){
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media=((a*2)+(b*3)+(c*5))/10;
            System.out.printf("%.2f%n",media);
        }


    }
}
