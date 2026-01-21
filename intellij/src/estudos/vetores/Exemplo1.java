package estudos.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Locale.setDefault(Locale.US);
         System.out.println("Digite a quantidade de alturas que deseja colocar:");
         int n=sc.nextInt();
         double[] vect=new double[n];

         for (int i=0;i<n;i++){
             System.out.println("Digite a altura: ");
             vect[i]=sc.nextDouble();
         }

         double sum=0.0;

         for (int i=0;i<n;i++){
             sum+=vect[i];
         }
         double media=sum/n;
         System.out.printf("Average HEIGHT: %.2f",media);
         sc.close();
    }
}
