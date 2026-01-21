package Fatec.exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        double produto;

        System.out.println("Digite tres numeros");
        System.out.print("Digite o primeiro numero: ");
        n1=sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2=sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        n3=sc.nextInt();

        produto=(n1*n2)*n3;

        System.out.println("O produto é " + produto);
    }
}
