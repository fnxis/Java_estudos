package estudos.Fatec.ex5;

import java.util.HashMap;
import java.util.Map;

public class FaturaObserver implements Observer {

    private Map<String, Double> faturas = new HashMap<>();

    @Override
    public void processarPassagem(Passagem passagem) {
        String tag = passagem.getTag();
        double totalAtual = faturas.getOrDefault(tag,0.0);
        totalAtual += passagem.getPreco();
        faturas.put(tag, totalAtual);

        System.out.printf(
                "TAG: %s | Passagem: R$ %.2f | Fatura Atual: R$ %.2f%n",
                tag,
                passagem.getPreco(),
                totalAtual
        );
    }
}