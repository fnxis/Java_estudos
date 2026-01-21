package estudos.exercicio_objetos_metodos;

import estudos.exercicio_objetos_metodos.entities.student;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        student student = new student();

        System.out.print("Name: ");
        student.name=sc.nextLine();

        System.out.print("Enter your 3 notes : ");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.println(student.toString());
        System.out.println(student.situation());
        if (student.totalPoints()<60){
            System.out.println("MISSING " + student.missingPoints() + " points");
        }
    }
}
