package estudos.Interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        String path="C:\\Users\\Guilherme Porto\\Desktop\\in.txt";

        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String employeeCsv= br.readLine();
            while(employeeCsv!=null){
                String[] fields=employeeCsv.split(",");
                employees.add(new Employee(fields[0],Double.parseDouble(fields[1])));
                employeeCsv=br.readLine();
            }
            Collections.sort(employees);
            for (Employee e:employees){
                System.out.println(e.getName()+","+e.getSalary());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
