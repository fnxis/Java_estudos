package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ex04ProdutoEstadual> listaEstaduais = new ArrayList<>();
        ArrayList<Ex04ProdutoNacional> listaNacionais = new ArrayList<>();
        ArrayList<Ex04ProdutoImportado> listaImportados = new ArrayList<>();
        int opcao = 0;

        while (opcao != 9) {
            System.out.println("\n1-Cadastrar Estadual | 2-Nacional | 3-Importado");
            System.out.println("4-Exibir Estaduais | 5-Nacionais | 6-Importados");
            System.out.println("7-Exibir Todos | 9-SAIR");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Descrição: ");
                String desc = sc.nextLine();
                System.out.print("Valor: ");
                double val = sc.nextDouble();

                if (opcao == 1) listaEstaduais.add(new Ex04ProdutoEstadual(desc, val));
                else if (opcao == 2) listaNacionais.add(new Ex04ProdutoNacional(desc, val));
                else listaImportados.add(new Ex04ProdutoImportado(desc, val));
            }

            switch (opcao) {
                case 4: for (Ex04ProdutoEstadual p : listaEstaduais) p.relatorio(); break;
                case 5: for (Ex04ProdutoNacional p : listaNacionais) p.relatorio(); break;
                case 6: for (Ex04ProdutoImportado p : listaImportados) p.relatorio(); break;
                case 7:
                    System.out.println("=== TODOS OS PRODUTOS ===");
                    for (Ex04ProdutoEstadual p : listaEstaduais) p.relatorio();
                    for (Ex04ProdutoNacional p : listaNacionais) p.relatorio();
                    for (Ex04ProdutoImportado p : listaImportados) p.relatorio();
                    break;
            }
        }
        sc.close();
    }

}
