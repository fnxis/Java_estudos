package estudos.vetores.exercicios;

import estudos.vetores.exercicios.util.Quartos;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quartos[] vect = new Quartos[10];

        System.out.println("Quantos quartos vao ser alugados? ");
        int n= sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Quarto #"+i);
            System.out.print("Nome: ");

            String nome = sc.next();

            System.out.print("EMAIL:");

            String email = sc.next();

            System.out.print("Qual o numero do quarto? ");

            int numquarto = sc.nextInt();
            Quartos quartosvar = new Quartos(nome,email);

            vect[numquarto] = quartosvar;

        }

        for (int i=0; i<10; i++) {
            if(vect[i] != null){
                System.out.println("#"+i+" "+vect[i]);

            }

        }


    }
}
