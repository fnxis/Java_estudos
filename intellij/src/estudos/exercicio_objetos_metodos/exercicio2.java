package estudos.exercicio_objetos_metodos;
import estudos.exercicio_objetos_metodos.entities.employee;
import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        employee employee = new employee();

        System.out.println("Name: ");
        employee.name=sc.nextLine();
        System.out.println("Gross salary: ");
        employee.grossSalary=sc.nextDouble();
        System.out.println("Tax");
        employee.tax=sc.nextDouble();

        System.out.println("Employee" + employee.toString());
        System.out.println("which percentage to increase salary? ");
        double percentage=sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee.toString());
    }
}
