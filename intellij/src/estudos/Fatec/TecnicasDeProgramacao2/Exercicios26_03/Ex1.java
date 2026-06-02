package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        System.out.print("Valor de referencia: ");
        int ref = sc.nextInt();

        int menores = 0, iguais = 0;

        // a
        for (int i = 0; i < 10; i++) {
            if (v[i] > ref) System.out.println("Maior: " + v[i]);
            if (v[i] < ref) menores++;
            if (v[i] == ref) iguais++;
        }
        //b
        System.out.println("Menores: " + menores);

        //c
        System.out.println("Iguais: " + iguais);

        // d
        int[] v2 = new int[50];
        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            v2[i] = r.nextInt(100);
        }

        int encontrados = 0;

        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int j = 0; j < 50; j++) {
                if (v[i] == v2[j]) cont++;
            }
            System.out.println(v[i] + " aparece " + cont + " vezes");
            if (cont > 0) encontrados++;
        }

        double perc = (encontrados / 50.0) * 100;
        System.out.println("Percentual: " + perc + "%");
    }

}
