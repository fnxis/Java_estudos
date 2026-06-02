package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao3POO {
    public static void main(String[] args) {

        Questao3POO_Universidade princeton = new Questao3POO_Universidade("Princeton (EUA)");
        Questao3POO_Universidade cambridge = new Questao3POO_Universidade("Cambridge (Inglaterra)");

        Questao3POO_Pessoa einstein = new Questao3POO_Pessoa("Albert Einstein", "14/03/1879");
        Questao3POO_Pessoa newton = new Questao3POO_Pessoa("Isaac Newton", "04/01/1643");

        einstein.associarUniversidade(princeton);
        newton.associarUniversidade(cambridge);

        // Exibir dados
        System.out.println("=== Pessoas ===");
        einstein.informarDados();
        System.out.println();
        newton.informarDados();
    }
}
