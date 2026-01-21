package Fatec;

import java.util.Scanner;

public class comparacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1,number2;

        System.out.println("Digite o primeiro numero: ");
        number1=input.nextInt();

        System.out.println("Digite o segundo numero: ");
        number2=input.nextInt();

        if(number1==number2){
            System.out.printf("%d == %d",number1,number2);
        }if (number1>number2) {
            System.out.printf("%d > %d",number1,number2);
        }if (number2>number1) {
            System.out.printf("%d > %d",number2,number1);
        }if (number1!=number2) {
            System.out.printf("%d != %d",number1,number2);
        }if (number1>=number2) {
            System.out.printf("%d >= %d",number1,number2);
        }if (number1<=number2) {
            System.out.printf("%d <= %d",number1,number2);

        }
    }
}
