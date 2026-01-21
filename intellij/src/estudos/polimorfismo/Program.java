package estudos.polimorfismo;

import estudos.polimorfismo.entities.Employee;
import estudos.polimorfismo.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos funcionarios voçe quer inserir: ");
        int n=input.nextInt();
        List<Employee> employees=new ArrayList<>();


        for(int i=0;i<n;i++)
        {
            System.out.println("Employee #"+(i+1)+" Data: ");
            System.out.println("Outsourced (y/n): ");
            char ch=input.next().charAt(0);
            System.out.println("Name: ");
            input.nextLine();
            String name=input.nextLine();
            System.out.println("Hours: ");
            int hours=input.nextInt();
            System.out.println("Value: ");
            double valuePerHour=input.nextDouble();

            if(ch=='y'){
                System.out.println("Aditional charge: ");
                double aditionalCharge=input.nextDouble();
                Employee employee2=new OutSourcedEmployee(name,hours,valuePerHour,aditionalCharge);
                employees.add(employee2);
            }
            else {
                Employee employee3 = new Employee(name, hours, valuePerHour);
                employees.add(employee3);
            }
        }

        System.out.println("Payments:");
        for(Employee e:employees){
            System.out.println(e.toString());
        }



    }
}
