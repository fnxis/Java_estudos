package estudos.exercicio_membros_estaticos;
import estudos.exercicio_membros_estaticos.util.currency_converter;
import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("what is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.print("how many dollars will be bought? ");
        double quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f",currency_converter.converter(dollar,quantity));
    }

}
