package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigoPeca1,numPecas1,codigoPeca2,numPecas2;
        double valorPeca1,valorPeca2,conta;
        System.out.println("Digite o codigo da peça, o numero de peças e o valor de cada: ");
        codigoPeca1=sc.nextInt();
        numPecas1=sc.nextInt();
        valorPeca1=sc.nextDouble();
        System.out.println("Digite o codigo da peça 2, o numero de peças e o valor de cada: ");

        codigoPeca2=sc.nextInt();
        numPecas2=sc.nextInt();
        valorPeca2=sc.nextDouble();

        conta=(double) (numPecas1*valorPeca1)+(numPecas2*valorPeca2);

        System.out.printf("Valor a pagar: R$%.2f",conta);

        sc.close();
    }
}
