package exercicio_estruturas_condicionais;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero par saber se é multiplo ou nao,os números devem poder ser digitados em \n" +
                "ordem crescente ou decrescente");

        int number1,number2;
        number1=input.nextInt();
        number2=input.nextInt();

        if (number1%number2==0 || number2%number1==0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }


    }
}
