package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {

        Random r = new Random();
        int[] w = new int[10];
        int[] k = new int[10];

        for (int i = 0; i < 10; i++) {
            w[i] = r.nextInt(10);
            k[i] = r.nextInt(10);
        }

        int soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += w[i] + k[9 - i];
        }

        System.out.println("Resultado: " + soma);
    }
}
