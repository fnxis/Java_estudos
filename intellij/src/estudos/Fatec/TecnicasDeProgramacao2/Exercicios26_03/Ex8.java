package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

public class Ex8 {

    public static void main(String[] args) {
        int[] jogadores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double[] Xi = {8, 4, 6, 10, 9, 7, 8, 12, 5, 8, 3};
        int n = Xi.length;

        double somaXi = 0;
        for (double acerto : Xi) {
            somaXi += acerto;
        }
        double M = somaXi / n;

        double[] xi = new double[n];
        double[] xiQuadrado = new double[n];
        double varianciaS = 0;

        for (int i = 0; i < n; i++) {
            xi[i] = Xi[i] - M;
            xiQuadrado[i] = Math.pow(xi[i], 2);
            varianciaS += xiQuadrado[i];
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s | %-10s %n", "Jogador", "Acertos(Xi)", "xi", "(xi)^2");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d | %-10.0f | %-10.2f | %-10.2f %n",
                    jogadores[i], Xi[i], xi[i], xiQuadrado[i]);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Média (M): %.2f %n", M);
        System.out.printf("Variância (S): %.2f %n", varianciaS);
        System.out.println("---------------------------------------------------------");
    }

}
