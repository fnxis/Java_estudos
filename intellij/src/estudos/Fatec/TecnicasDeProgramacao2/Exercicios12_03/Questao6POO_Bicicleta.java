package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao6POO_Bicicleta implements Questao6POO_Veiculo{

    private String modelo;
    private int ano;
    private String tipo;
    private double taxaFixa;

    public Questao6POO_Bicicleta(String modelo, int ano, String tipo, double taxaFixa) {
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.taxaFixa = taxaFixa;
    }

    @Override
    public double calcularTaxa() {
        return taxaFixa;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", tipo='" + tipo + '\'' +
                ", taxa=" + calcularTaxa() +
                '}';
    }
}
