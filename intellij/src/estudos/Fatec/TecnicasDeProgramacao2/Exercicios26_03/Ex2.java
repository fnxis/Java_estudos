package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] codigo = new int[10];
        double[] valor = new double[10];
        int[] qtd = new int[10];

        for (int i = 0; i < 10; i++) {
            codigo[i] = sc.nextInt();
            valor[i] = sc.nextDouble();
            qtd[i] = sc.nextInt();
        }

        double totalGeral = 0;
        int totalItens = 0;

        System.out.printf("%-10s %-10s %-10s %-10s\n", "COD", "V.UNIT", "QTD", "TOTAL");
        //a
        for (int i = 0; i < 10; i++) {
            double total = valor[i] * qtd[i];
            System.out.printf("%-10d %-10.2f %-10d %-10.2f\n",
                    codigo[i],
                    valor[i],
                    qtd[i],
                    total);

            totalGeral += total;
            totalItens += qtd[i];
        }
        //b
        System.out.println("Total itens: " + totalItens);
        System.out.println("Total vendido: " + totalGeral);
        System.out.println("Media itens: " + (totalItens / 10.0));
        System.out.println("Media valor unitario: " + (totalGeral / totalItens));
        System.out.println("Media por item: " + (totalGeral / 10));

        // c
        System.out.print("Buscar codigo: ");
        int busca = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (codigo[i] == busca) {
                double total = valor[i] * qtd[i];
                System.out.println(codigo[i] + " " + valor[i] + " " + qtd[i] + " " + total);
            }
        }


    }

}
