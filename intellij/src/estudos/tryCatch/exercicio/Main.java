package estudos.tryCatch.exercicio;

import estudos.tryCatch.exercicio.models.entities.Account;
import estudos.tryCatch.exercicio.models.exceptions.LimitException;
import estudos.tryCatch.exercicio.models.exceptions.SaldoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite o numero da conta: ");
            Integer conta = input.nextInt();
            System.out.println("Digite o nome do proprietario: ");
            String nome = input.next();
            System.out.println("Digite o saldo da conta: ");
            Double saldo = input.nextDouble();
            System.out.println("Digite o valor do limite da conta: ");
            Double valor = input.nextDouble();

            Account account=new Account(conta,nome,saldo,valor);
            System.out.println("Digite quanto quer sacar");
            Double sacar=input.nextDouble();

            account.withdraw(sacar);
            System.out.println("Novo saldo: "+account.getBalance());


        }
        catch (LimitException e){
            System.out.println("Erro de limite :"+e.getMessage());
        }catch (SaldoException e){
            System.out.println("Erro de saldo : "+e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error "+e.getMessage());;
        }



    }
}
