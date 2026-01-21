package estudos.Interfaces;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        double basicValue=contract.getTotalValue()/months;

        for(int i=1;i<=months;i++){

            LocalDate dueDate = contract.getData().plusMonths(i);
            double interest=onlinePaymentService.interest(basicValue,i);
            double fee=onlinePaymentService.paymentfee(interest+basicValue);
            double valorFinal=fee+basicValue+interest;

            contract.getInstallments().add(new Installment(dueDate,valorFinal));
        }

    }

}
