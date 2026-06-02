package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Questao1POO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Questao1POOVenda[] vendas = new Questao1POOVenda[10];

        double totalGeral = 0;
        int totalItens = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nVenda " + (i + 1));

            System.out.print("Código: ");
            int codigo = sc.nextInt();

            System.out.print("Valor unitário: ");
            double valor = sc.nextDouble();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();
        }
    }
}
