package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double pi=3.14159;
        double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;

        A=sc.nextDouble();
        B=sc.nextDouble();
        C=sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = pi * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("Triangulo: %.2f%n", triangulo);
        System.out.printf("Circulo: %.2f%n" , circulo);
        System.out.printf("Trapezio: %.2f%n" , trapezio);
        System.out.printf("Quadrado: %.2f%n" , quadrado);
        System.out.printf("Retangulo: %.2f%n" , retangulo);



    }
}
