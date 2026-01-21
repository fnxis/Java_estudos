package estudos.Fatec.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class aplicandoArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media,calculo,numeros;

        numeros=0;
        media=0;
        calculo=0;

        ArrayList<Double> array=new ArrayList<Double>();


        for (int i=0; i<5; i++){
            System.out.println("Digite o " + (i+1)+ "º Numero: ");
            numeros=sc.nextInt();
            array.add(numeros);
            media+=numeros;
            calculo=media/array.size();
        }
        for (int a=0;a<5;a++){
            System.out.println(array.get(a));
        }
        System.out.println("A media é : " + calculo);
    }
}
