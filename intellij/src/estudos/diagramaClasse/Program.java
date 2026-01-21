package estudos.diagramaClasse;

import estudos.diagramaClasse.entities.Department;
import estudos.diagramaClasse.entities.HourContract;
import estudos.diagramaClasse.entities.Worker;
import estudos.diagramaClasse.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf=  new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName=sc.nextLine();

        System.out.println("Enter worker data: ");

        System.out.println("Name:");
        String workerName=sc.nextLine();

        System.out.println("Level: ");
        String worklevel=sc.nextLine();

        System.out.println("Base salary: ");
        double baseSalary=sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(worklevel),baseSalary,new Department(departmentName));

        System.out.println("How many contracts to this worker? ");
        int numberOfContracts=sc.nextInt();

        for(int i=0;i<numberOfContracts;i++){
            System.out.println("Enter contract #"+(i+1)+" data: ");
            sc.nextLine();

            System.out.println("Date (DD/MM/YYYY):");
            Date contractDate=sdf.parse(sc.nextLine());

            System.out.println("Value por hour: ");
            Double hour=sc.nextDouble();

            System.out.println("Duration (hours): ");
            int duration=sc.nextInt();

            HourContract contract=new HourContract(contractDate,hour,duration);

            worker.addContract(contract);
        }

        System.out.println("Enter the month and year to calculate income (mm/yyyy): ");
        String monthAndYear=sc.next();
        int month=Integer.parseInt(monthAndYear.substring(0,2));
        int year=Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: "+ worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": "+ worker.income(year,month));


    }
}
