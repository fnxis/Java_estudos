package estudos.exercicio_metodos_abstratos;

import estudos.exercicio_metodos_abstratos.entities.Pessoa;
import estudos.exercicio_metodos_abstratos.entities.PessoaFisica;
import estudos.exercicio_metodos_abstratos.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantidade de contribuintes: ");
        int n=input.nextInt();


        for(int i=1;i<=n;i++) {
            System.out.println("Tax player #"+(i)+" data");
            System.out.println("Voce é pessoa Fisica ou Juridica? (F/J)");
            char ch = input.next().toUpperCase().charAt(0);
            input.nextLine();
            System.out.println("Nome: ");
            String nome=input.nextLine();
            System.out.println("Ganho anual: ");
            double ganhoAnual=input.nextDouble();

            if (ch=='F'){
                System.out.println("Gasto com saude: ");
                double gastoComSaude=input.nextDouble();
                pessoas.add(new PessoaFisica(nome,ganhoAnual,gastoComSaude));
            }
            else if (ch=='J') {
                System.out.println("Numeros de funcionarios: ");
                int nFuncionarios = input.nextInt();
                pessoas.add(new PessoaJuridica(nome, ganhoAnual, nFuncionarios));
            }
        }

        System.out.println("Impostos a pagar: \n");
        Double total=0.0;
        for(Pessoa pessoa:pessoas) {
            System.out.println(pessoa.getNome()+": $ "+String.format("%.2f",pessoa.imposto()));
            total += pessoa.imposto();
        }

        System.out.println("\nTotal taxes: "+total);

    }
}
