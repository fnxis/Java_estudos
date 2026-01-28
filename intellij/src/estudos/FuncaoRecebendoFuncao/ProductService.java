package estudos.FuncaoRecebendoFuncao;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filtereSum(List<Product> list, Predicate<Product> criterio) {// usamos aqui o Predicate para passar um criterio posteriormente no Programa em forma de lambda
        double sum=0.0;
        for (Product product : list) {
            if (criterio.test(product)) {
                sum+=product.getPreco();
            }
        }return sum;
    }

}
