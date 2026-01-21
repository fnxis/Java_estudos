package estudos.Fatec.exercicios;

import java.util.Scanner;

public class exercicio_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int media,calculo;

        media=0;
        calculo=0;

        int[]array = new int[5];


        for (int i=0; i<array.length; i++){
            System.out.println("Digite o " + (i+1)+ "º Numero: ");
            array[i]=input.nextInt();
        }
       for (int a=0;a<array.length;a++){
            System.out.println(array[a]);
            media+=array[a];
            calculo=media/array.length;
        }
        System.out.println("A media é : " + calculo);
    }
}
