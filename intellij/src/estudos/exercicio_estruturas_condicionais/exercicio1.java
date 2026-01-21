package exercicio_estruturas_condicionais;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para saber se é positivo ou negativo: ");
        int numero = sc.nextInt();

        if (numero >=0){
            System.out.println("é positivo");
        }
        else{
            System.out.println("é negativo");
        }
    }
}
