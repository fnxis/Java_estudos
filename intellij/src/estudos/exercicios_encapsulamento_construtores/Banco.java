package estudos.exercicios_encapsulamento_construtores;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da conta:");
        int numero=sc.nextInt();
        OperacoesBancarias op = new OperacoesBancarias(numero);
        System.out.print("Digite o nome do Usuario:");
        String nome=sc.next();

        System.out.print("Deseja fazer um deposito inicial? (S/N)");
        String depositoInicial=sc.next();
        if (depositoInicial.equalsIgnoreCase("S")) {
            System.out.print("Digite o saldo do Usuario:");
            double saldo=sc.nextDouble();
            op.setSaldo(saldo);
        }

        System.out.printf("Account data:%nAccount %s,Holder: %s, Balance: $ %.2f%n",op.getNumeroConta(),nome,op.getSaldo());
        System.out.printf("Digite o deposito: ");
        double deposito1=sc.nextDouble();
        op.setSaldo(deposito1);
        System.out.printf("Updated account data:%nAccount %s,Holder: %s, Balance: $ %.2f%n",op.getNumeroConta(),nome,op.getSaldo());
        System.out.printf("Digite o saque: ");
        double saque1=sc.nextDouble();
        System.out.printf("Updated account data:%nAccount %s,Holder: %s, Balance: $ %.2f",op.getNumeroConta(),nome,op.saque(saque1));





    }
}
