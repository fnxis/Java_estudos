package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Soma:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " + " + i + " = " + (n + i));
        }

        System.out.println("Multiplicacao:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }


}
