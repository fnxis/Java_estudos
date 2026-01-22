package estudos.set.Exercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A?");
        int alunosA=sc.nextInt();
        for(int i=0;i<alunosA;i++){
            Integer numero= sc.nextInt();
            a.add(numero);
        }
        System.out.println("How many students for course B?");
        int alunosB=sc.nextInt();
        for(int i=0;i<alunosB;i++){
            Integer numero= sc.nextInt();
            b.add(numero);
        }
        System.out.println("How many students for course C?");
        int alunosC=sc.nextInt();
        for(int i=0;i<alunosC;i++){
            Integer numero= sc.nextInt();
            c.add(numero);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.println("Total students: "+ total.size());

        sc.close();
    }
}
