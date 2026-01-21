package estudos.enumeracoes.entities;

import estudos.enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Orders {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Orders(Integer id, OrderStatus status, Date moment) {
        this.id = id;
        this.status = status;
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}

