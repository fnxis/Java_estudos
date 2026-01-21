import java.util.Scanner;

public class funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tres numeros: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int higher=max(a,b,c);
        showResult(higher);

        sc.close();
    }

    public static int max(int a,int b,int c){
        if (a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void showResult(int higher){
        System.out.printf("Higher = %d\n",higher);

    }


}
