package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao5POO {
    public static void main(String[] args) {
        Questao5POO_Universidade uni = new Questao5POO_Universidade();

        // a)
        for (int i = 1; i <= 10; i++) {
            uni.adicionarDepartamento(new Questao5POO_Departamento("Depto " + i, i));
        }

        // b)
        System.out.println("Lista de Departamentos:");
        uni.exibirDepartamentos();

        // c)
        Questao5POO_Departamento busca = new Questao5POO_Departamento("Depto 5", 5);
        Questao5POO_Departamento busca2 = new Questao5POO_Departamento("Depto 20",20);
        System.out.println("\nBuscando departamento...");
        uni.buscarDepartamento(busca);
        uni.buscarDepartamento(busca2);
    }
}
