package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a taxa Selic (ex: 13 para 13%): ");
        double selic = sc.nextDouble() / 100;

        System.out.print("Digite o capital inicial: ");
        double capital = sc.nextDouble();

        System.out.println("\n--- Banco Pague Mais ---");
        calcularBancoPagueMais(capital, selic);

        System.out.println("\n--- Fura Bolso ---");
        calcularFuraBolso(capital, selic);

        sc.close();
    }

    public static void calcularBancoPagueMais(double capital, double selic) {
        double taxa = selic * 0.85;

        double total = capital;
        double rendimentoTotal = 0;

        System.out.println("Mes\tCapital\tRendimento\tTotal");

        for (int mes = 1; mes <= 12; mes++) {
            double rendimento = total * taxa / 12;
            total += rendimento;
            rendimentoTotal += rendimento;

            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\n",
                    mes, total - rendimento, rendimento, total);
        }

        double taxaAdm = rendimentoTotal * 0.10;
        double liquido = rendimentoTotal - taxaAdm;

        System.out.printf("\nRendimento Total: " + "%.2f",rendimentoTotal);
        System.out.printf("\nDescontos: " + "%.2f",taxaAdm);
        System.out.printf("\nRendimento Liquido: " + "%.2f\n",liquido);
    }

    public static void calcularFuraBolso(double capital, double selic) {
        double taxa = selic * 0.93;

        double total = capital;
        double rendimentoTotal = 0;

        System.out.println("Mes\tCapital\tRendimento\tTotal");

        for (int mes = 1; mes <= 12; mes++) {
            double rendimento = total * taxa / 12;
            total += rendimento;
            rendimentoTotal += rendimento;

            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\n",
                    mes, total - rendimento, rendimento, total);
        }

        double taxaAdm = capital * 0.01;
        double imposto = rendimentoTotal * 0.06;
        double descontos = taxaAdm + imposto;
        double liquido = rendimentoTotal - descontos;

        System.out.printf("\nRendimento Total: " +"%.2f", rendimentoTotal);
        System.out.printf("\nDescontos: " +"%.2f", descontos);
        System.out.printf("\nRendimento Liquido: " +"%.2f\n", liquido);
    }
}
