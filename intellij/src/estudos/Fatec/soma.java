package Fatec;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1,number2,soma;

        System.out.println("Digite o primeiro numero: ");

        number1=sc.nextInt();

        System.out.println("Digite o segundo numero: ");

        number2=sc.nextInt();

        soma=number1+number2;

        System.out.println("SOMA = "+ soma);
    }

}
