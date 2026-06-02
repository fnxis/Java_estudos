package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite posição X (0 a 7): ");
        int x = sc.nextInt();

        System.out.print("Digite posição Y (0 a 7): ");
        int y = sc.nextInt();

        // Soma
        int soma = vetor[x] + vetor[y];

        System.out.println("Soma dos valores: " + soma);

        sc.close();
    }

}
