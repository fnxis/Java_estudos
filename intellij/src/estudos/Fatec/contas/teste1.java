package estudos.Fatec.contas;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Conta1 Conta1 = new Conta1();

        System.out.println(Conta1.getName());

        Conta1.setName(input.nextLine());
        String nome = input.nextLine();
        Conta1.setName(nome);
        System.out.println(Conta1.getName());

    }
}
