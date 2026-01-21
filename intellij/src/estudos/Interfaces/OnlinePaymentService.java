package estudos.Interfaces;

public interface OnlinePaymentService {

    public double paymentfee(Double amount);
    public double interest(Double amount,Integer months);

}
