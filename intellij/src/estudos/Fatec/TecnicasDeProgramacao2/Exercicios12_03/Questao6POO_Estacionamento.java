package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.ArrayList;
import java.util.List;

public class Questao6POO_Estacionamento {
    private List<Questao6POO_Veiculo> veiculos;

    public Questao6POO_Estacionamento() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Questao6POO_Veiculo v) {
        veiculos.add(v);
    }

    public double calcularTotal() {
        double total = 0;
        for (Questao6POO_Veiculo v : veiculos) {
            total += v.calcularTaxa();
        }
        return total;
    }

    public void listarVeiculos() {
        for (Questao6POO_Veiculo v : veiculos) {
            System.out.println(v);
        }
    }
}
