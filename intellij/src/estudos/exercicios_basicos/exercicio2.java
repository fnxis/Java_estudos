package exercicios_basicos;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio,area;
        double pi=3.14159;
        double  raio_quadrado;
        System.out.println("Digite o Raio: ");
        raio=sc.nextDouble();
        raio_quadrado=Math.pow(raio,2);
        area=pi*raio_quadrado;
        System.out.printf("A areá deste circulo é = %.4f",area);





    }
}
