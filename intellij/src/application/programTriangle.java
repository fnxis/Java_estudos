package application;

import java.util.Locale;
import java.util.Scanner;
import entities.triangle;
public class programTriangle {
    public static void main(String[] args) {

        triangle x,y;
        x=new triangle();//chama a classe triangulo atribuindo o x como um objeto
        y=new triangle();

        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the measure of triangle x: ");
        x.a=sc.nextDouble();
        x.b=sc.nextDouble();
        x.c=sc.nextDouble();
        System.out.print("Enter the measure of triangle y: ");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble();

        double areaX=x.area();

        double areaY=y.area();

        System.out.println("Triangle x area : " + areaX);
        System.out.println("Triangle y area : " + areaY);

        if (areaX>areaY){
            System.out.println("Larger area: x");
        }else if (areaX<areaY){
            System.out.println("larger area: y");
        }else {
            System.out.println("larger area: x and y");
        }

        sc.close();
    }
}
