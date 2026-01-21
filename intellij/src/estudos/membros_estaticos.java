package estudos;
import estudos.util.calculator;
import java.util.Locale;
import java.util.Scanner;

public class membros_estaticos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculator.circumference(radius);

        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI Value: %.2f%n",calculator.PI);

    }


}
