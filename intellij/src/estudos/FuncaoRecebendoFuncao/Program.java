package estudos.FuncaoRecebendoFuncao;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("HD", 80.90));
        list.add(new Product("SSD", 240.90));
        list.add(new Product("HD Externo", 30.50));
        list.add(new Product("TV", 980.90));

        ProductService service = new ProductService();

        double sum=service.filtereSum(list,p->p.getPreco()>90);// expressao para decidir a condicao da soma

        System.out.println(sum);


    }

}
