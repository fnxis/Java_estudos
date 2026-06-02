package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int tamanho = 100;
        int[] W = new int[tamanho];
        int[] J = new int[tamanho];
        Random gerador = new Random();

        double somaW = 0;
        double somaJ = 0;

        for (int i = 0; i < tamanho; i++) {
            W[i] = gerador.nextInt(101);
            J[i] = gerador.nextInt(101);
            somaW += W[i];
            somaJ += J[i];
        }

        int maxW = W[0];
        int minJ = J[0];

        for (int i = 0; i < tamanho; i++) {

            if (W[i] > maxW) {
                maxW = W[i];
            }

            if (J[i] < minJ) {
                minJ = J[i];
            }
        }

        double mediaW = somaW / tamanho;
        double mediaJ = somaJ / tamanho;

        double t = (maxW * (minJ + 1)) / (mediaW + mediaJ);

        System.out.println(t);
    }
}
