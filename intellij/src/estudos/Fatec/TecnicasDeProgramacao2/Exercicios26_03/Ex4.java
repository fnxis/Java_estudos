package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex4 {

    public static void main(String[] args) {

        Random r = new Random();

        int[] A = new int[20];
        int[] B = new int[20];
        Set<Integer> C = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            A[i] = r.nextInt(51);
            B[i] = r.nextInt(51);
            C.add(A[i]);
            C.add(B[i]);
        }

        System.out.println(C);
    }


}


