package exercicio_estruturas_condicionais;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero para saber se é impar ou par: ");
        int numero=sc.nextInt();

        if (numero %2 == 0){
            System.out.println("esse numero é par");
        }
        else {
            System.out.println("esse numero é impar");
        }

    }
}
