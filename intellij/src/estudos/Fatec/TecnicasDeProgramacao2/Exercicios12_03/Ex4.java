package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer num;
        System.out.println("Digite um numero: ");
        num = input.nextInt();
        Integer contador=0;

        for (int i=0;i<num;i++){
            System.out.println("Digite um numero: ");
            Integer num2 = input.nextInt();
            if (num2<0){
                contador++;
            }

        }
        System.out.println("De "+num+" numero, "+contador+" Foram negativos");
    }

}
