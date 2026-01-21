package estudos.Interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private String number;
    private LocalDate data;
    private double totalValue;
    private List<Installment> installments=new ArrayList<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Contract(String number, LocalDate data, double totalValue) {
        this.number = number;
        this.data = data;
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
