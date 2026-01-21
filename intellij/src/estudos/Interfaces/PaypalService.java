package estudos.Interfaces;

public class PaypalService implements OnlinePaymentService {

    public PaypalService() {
    }

    @Override
    public double paymentfee(Double amount) {
     return amount*0.02;
    }
    @Override
    public double interest(Double amount,Integer months) {
        return amount*0.01*months;
    }
}
