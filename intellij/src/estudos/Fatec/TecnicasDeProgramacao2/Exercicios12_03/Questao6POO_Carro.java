package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao6POO_Carro implements Questao6POO_Veiculo{
    private String modelo;
    private String placa;
    private double valorHora;
    private int horas;

    public Questao6POO_Carro(String modelo, String placa, double valorHora, int horas) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularTaxa() {
        return valorHora * horas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", taxa=" + calcularTaxa() +
                '}';
    }
}
