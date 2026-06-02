package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.Random;

public class Ex7 {

    public static void main(String[] args) {
        int n = 100;
        double[] J = new double[n];
        Random rand = new Random();


        for (int i = 0; i < n; i++) {
            J[i] = rand.nextDouble(101);
        }

        double soma = 0;
        for (double valor : J) {
            soma += valor;
        }
        double m = soma / n;

        double somaQuadradosDiferenca = 0;
        for (int i = 0; i < n; i++) {
            somaQuadradosDiferenca += Math.pow(J[i] - m, 2);
        }

        double desvioPadrao = Math.sqrt((1.0 / (n - 1)) * somaQuadradosDiferenca);

        System.out.println("O desvio padrão do sistema é: " + desvioPadrao);
    }

}
