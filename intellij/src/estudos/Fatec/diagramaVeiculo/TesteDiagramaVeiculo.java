package estudos.Fatec.diagramaVeiculo;

import java.util.Scanner;

public class TesteDiagramaVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Automovel automovel = new Automovel();
        Motocicleta motocicleta = new Motocicleta();

        automovel.ligar();
        automovel.acelerar(120);
        automovel.frear(10);
        automovel.frear(0);
        automovel.desligar();
        automovel.setPreco(75000.0);
        automovel.setCor("Vermelho Mate");
        automovel.setPreco(automovel.desconto(10.0));
        System.out.println("O valor de venda a vista do automovel de cor "+automovel.getCor()+" sera de "+Veiculo.calcularValorVenda(automovel));

        motocicleta.ligar();
        motocicleta.acelerar(120);
        motocicleta.frear(10);
        motocicleta.frear(0);
        motocicleta.desligar();
        motocicleta.setPreco(75000.0);
        motocicleta.setPlaca("ABCD1234");
        System.out.println("O valor de venda a vista da Motocicleta "+motocicleta.getPlaca() + " sera de R$ "+motocicleta.calcularValorVenda(motocicleta));

    }
}
