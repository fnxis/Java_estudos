package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ex03Aluno> listaAlunos = new ArrayList<>();
        int opcao = 0;

        while (opcao != 9) {
            System.out.println("\nMENU ACADEMIA");
            System.out.println("1 – Cadastrar Aluno");
            System.out.println("2 – Listar Alunos (somente nome)");
            System.out.println("3 – Relatório Geral");
            System.out.println("9 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();

                    Ex03Aluno novoAluno = new Ex03Aluno(id, nome, idade, peso, altura);
                    listaAlunos.add(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE ALUNOS ---");
                    for (Ex03Aluno a : listaAlunos) {
                        System.out.println("Nome: " + a.getNome());
                    }
                    break;

                case 3:
                    System.out.println("\n--- RELATÓRIO GERAL ---");
                    for (Ex03Aluno a : listaAlunos) {
                        a.exibir();
                    }
                    break;

                case 9:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

}
