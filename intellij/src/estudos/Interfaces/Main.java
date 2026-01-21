package estudos.Interfaces;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Entre os dados do contrato: ");
        String numero = sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
        System.out.print("Valor do contrato: ");
        double valor= sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();
        Contract contract=new Contract(numero,date,valor);
        ContractService contractService=new ContractService(new PaypalService());
        contractService.processContract(contract,parcelas);
        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

    }
}
