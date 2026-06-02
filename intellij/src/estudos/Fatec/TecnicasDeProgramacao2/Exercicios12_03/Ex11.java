package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Ex11 {

    public static void main(String[] args) {
        //a)
        int[] A = {1, 0, 5, -2, -5, 7};
        //b)
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma: " + soma);
        //c)
        A[4] = 100;
        //d)
        System.out.println("Vetor:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

}
