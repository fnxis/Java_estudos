package estudos.exercicio_objetos_metodos;

import estudos.exercicio_objetos_metodos.entities.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        retangulo retangulo = new retangulo();

        System.out.println("Enter retangle width and height: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println("AREA = " + retangulo.area());
        System.out.println("PERIMETER = " + retangulo.perimeter());
        System.out.println("DIAGONAL = " + retangulo.diagonal());

        sc.close();
    }
}
