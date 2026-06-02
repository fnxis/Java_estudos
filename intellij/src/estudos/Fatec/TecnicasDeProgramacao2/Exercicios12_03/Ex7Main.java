package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Ex7Main {

    public static void main(String[] args) {

        // a)
        Ex7Aluno a1;

        // b)
        a1 = new Ex7Aluno();
        a1.nome = "Guilherme";
        a1.p1 = 7.5;
        a1.p2 = 8.0;

        // c)
        System.out.println("Valores de a1:");
        System.out.println(a1.toString());

        // d)
        Ex7Aluno a2 = a1;

        // e)
        a2.p1 = 5.0;
        a2.p2 = 6.0;

        System.out.println("Valores de a1 após alteração:");
        System.out.println(a1.toString());

        System.out.println("Valores de a2:");
        System.out.println(a2.toString());

        // f)
        if (a1 == a2) {
            System.out.println("a1 e a2 apontam para o MESMO objeto.");
        } else {
            System.out.println("a1 e a2 são objetos diferentes.");
        }

    }

}
