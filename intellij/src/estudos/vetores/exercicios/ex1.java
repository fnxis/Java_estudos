package estudos.vetores.exercicios;
import java.util.Locale;
import java.util.Scanner;
import estudos.vetores.exercicios.util.exercicio1;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n=sc.nextInt();

        exercicio1[] vect=new exercicio1[n];

        if(n<=10){
            for (int i=0;i<n;i++){
                int x=sc.nextInt();
                vect[i]=new exercicio1(x);
            }

            for (int j=0;j<n;j++){
                if (vect[j].getNumber()<0){
                    System.out.println(vect[j].getNumber());
                }
            }





        }


        sc.close();
    }
}
