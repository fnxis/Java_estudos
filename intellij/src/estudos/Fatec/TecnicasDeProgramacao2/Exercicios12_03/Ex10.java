package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex10Venda[] vendas = new Ex10Venda[10];

        double totalGeral = 0;
        int totalItens = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nVenda " + (i + 1));

            System.out.print("Código do produto: ");
            int codigo = sc.nextInt();

            System.out.print("Valor unitário: ");
            double valor = sc.nextDouble();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            vendas[i] = new Ex10Venda(codigo, valor, qtd);

            double totalVenda = vendas[i].calcularTotal();
            totalGeral += totalVenda;
            totalItens += qtd;

            System.out.println("Total da venda: " + totalVenda);
        }

        double media = totalGeral / 10;

        Ex10Venda maior = vendas[0];
        Ex10Venda menor = vendas[0];

        for (int i = 1; i < 10; i++) {
            if (vendas[i].calcularTotal() > maior.calcularTotal()) {
                maior = vendas[i];
            }
            if (vendas[i].calcularTotal() < menor.calcularTotal()) {
                menor = vendas[i];
            }
        }

        System.out.println("\n=== RESULTADOS ===");

        System.out.println("Valor total vendido: " + totalGeral);
        System.out.println("Valor médio das vendas: " + media);

        System.out.println("\nProduto com MAIOR venda:");
        System.out.println("Código: " + maior.codigoProduto);
        System.out.println("Quantidade: " + maior.quantidade);
        System.out.println("Total: " + maior.calcularTotal());

        System.out.println("\nProduto com MENOR venda:");
        System.out.println("Código: " + menor.codigoProduto);
        System.out.println("Quantidade: " + menor.quantidade);
        System.out.println("Total: " + menor.calcularTotal());

        System.out.println("\nQuantidade total de itens vendidos: " + totalItens);

        sc.close();
    }

}
