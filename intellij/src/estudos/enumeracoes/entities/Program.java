package estudos.enumeracoes.entities;

import estudos.enumeracoes.entities.enums.OrderStatus;
import estudos.enumeracoes.entities.Orders;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Orders order = new Orders(1080, OrderStatus.ENVIADO,new Date());
        System.out.println(order);

        OrderStatus o2=OrderStatus.ENTREGUE;
        OrderStatus o3=OrderStatus.valueOf("ENVIADO");

        System.out.println(o2);
        System.out.println(o3);



    }
}
