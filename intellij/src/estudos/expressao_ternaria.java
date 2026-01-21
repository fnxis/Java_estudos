import java.util.Scanner;

public class expressao_ternaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preco;
        preco=input.nextDouble();
        double desconto= (preco>20)? preco*0.05:preco*0.1;

        System.out.print(desconto);
        input.close();
    }
}
