package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao2POO {
    public static void main(String[] args) {

        Questao2POO_Livro questao2POOLivro = new Questao2POO_Livro("Java Básico", 2020, 1, "Fabio");
        Questao2POO_DVD questao2POODVD = new Questao2POO_DVD("Os incriveis", 2018, 2, "Disney");
        Questao2POO_CD questao2POOCd = new Questao2POO_CD("Sina", 2013, 3, "Djavan");

        questao2POOLivro.exibirDados();
        questao2POODVD.exibirDados();
        questao2POOCd.exibirDados();
    }
}
