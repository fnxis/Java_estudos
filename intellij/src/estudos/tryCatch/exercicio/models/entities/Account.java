package estudos.tryCatch.exercicio.models.entities;

import estudos.tryCatch.exercicio.models.exceptions.LimitException;
import estudos.tryCatch.exercicio.models.exceptions.SaldoException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double WithdrawLimit;
    public Account(Integer number, String holder, Double balance , Double WithdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.WithdrawLimit = WithdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return WithdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        WithdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance =+ amount;
    }

    public void withdraw(Double amount){
        if (WithdrawLimit < amount){
            throw new LimitException("Limite menor que o saque");
        }if (balance<amount){
            throw new SaldoException("Saldo insuficiente");
        }
         balance =balance- amount;
    }

}
