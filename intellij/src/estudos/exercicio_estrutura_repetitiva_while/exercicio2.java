package exercicio_estrutura_repetitiva_while;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x=1;
        y=1;
        while(x!=0 && y!=0){
            x=sc.nextInt();
            y=sc.nextInt();

            if (x>0 && y>0){
                System.out.println("Primeiro");
            } else if (x<0 && y>0) {
                System.out.println("Segundo");
            } else if (x<0 && y<0) {
                System.out.println("Terceiro");
            }
            else if (x>0 && y<0) {
                System.out.println("Quarto");
            }
        }
    }
}
