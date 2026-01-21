package exercicios_basicos;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C,D;
        double dif;
        System.out.println("Digite o Valor de A: ");
        A=sc.nextInt();
        System.out.println("Digite o Valor de B: ");
        B=sc.nextInt();
        System.out.println("Digite o Valor de C: ");
        C=sc.nextInt();
        System.out.println("Digite o Valor de D: ");
        D=sc.nextInt();

        dif=(A*B-C*D);

        System.out.printf("Diferença = %.2f",dif);
    }
}
