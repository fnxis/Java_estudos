package estudos.Generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        String path="C:\\Windows\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line= br.readLine();
            while (line != null) {
                String[] split = line.split(",");
                list.add(new Products(split[0],Double.parseDouble(split[1])));
                line= br.readLine();
            }
            Products x= CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);

        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }

    }
}
