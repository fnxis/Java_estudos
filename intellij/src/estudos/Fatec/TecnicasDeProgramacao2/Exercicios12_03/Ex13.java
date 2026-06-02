package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[10];
        double[] quadrado = new double[10];

        // Ler valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        // Calcular quadrado
        for (int i = 0; i < 10; i++) {
            quadrado[i] = vetor[i] * vetor[i];
        }

        // Mostrar original
        System.out.println("\nVetor original:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }

        // Mostrar quadrado
        System.out.println("\nVetor ao quadrado:");
        for (int i = 0; i < 10; i++) {
            System.out.println(quadrado[i]);
        }

        sc.close();
    }

}
