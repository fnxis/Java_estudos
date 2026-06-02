package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Ex8 {

    public static void main(String[] args) {

        int[] X = {2, 7, 4, 3, 2};
        int[] Y = {1, 2, 3, 6, 5};

        int somaA = 0;
        int somaB = 0;
        int somaC1 = 0;
        int somaC2 = 0;

        // a)
        for (int j = 0; j < 5; j++) {
            somaA += X[j];
        }

        // b)
        for (int j = 0; j < 5; j++) {
            somaB += X[j] * Y[j];
        }

        // c)
        for (int j = 1; j < 4; j++) {
            somaC1 += X[j] * (Y[j] * Y[j]);
        }

        for (int j = 0; j < 5; j++) {
            somaC2 += 3;
        }

        int resultadoC = somaC1 + somaC2;

        System.out.println("Resultado A: " + somaA);
        System.out.println("Resultado B: " + somaB);
        System.out.println("Resultado C: " + resultadoC);

    }

    }

