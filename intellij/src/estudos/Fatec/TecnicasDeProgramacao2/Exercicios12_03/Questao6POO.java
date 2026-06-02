package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao6POO {
    public static void main(String[] args) {
        Questao6POO_Estacionamento est = new Questao6POO_Estacionamento();

        Questao6POO_Carro c1 = new Questao6POO_Carro("Civic", "ABC-1234", 10.0, 3);
        Questao6POO_Carro c2 = new Questao6POO_Carro("Corolla", "XYZ-9999", 12.0, 2);

        Questao6POO_Bicicleta b1 = new Questao6POO_Bicicleta("Caloi", 2020, "Urbana", 5.0);
        Questao6POO_Bicicleta b2 = new Questao6POO_Bicicleta("Monark", 2018, "Montanha", 7.0);

        est.adicionarVeiculo(c1);
        est.adicionarVeiculo(c2);
        est.adicionarVeiculo(b1);
        est.adicionarVeiculo(b2);

        System.out.println("Veículos estacionados:");
        est.listarVeiculos();

        System.out.println("\nTotal arrecadado: R$ " + est.calcularTotal());
    }
}
