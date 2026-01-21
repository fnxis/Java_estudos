package estudos.Matriz;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[][]mat=new int[n][n];
        int negative=0;
        for(int i=0;i< mat.length;i++){
            System.out.println("Linha "+(i+1)+ " da matriz");
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=sc.nextInt();

            }

        }

        System.out.println("Main diagonal");
        for(int i=0;i<n;i++){
            System.out.print(mat[i][i]+" ");
        }

        System.out.printf("%nNegative numbers%n");
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if (mat[i][j]<0){
                    negative++;
                }

            }
        }
        System.out.println(negative);
        sc.close();
    }

}
