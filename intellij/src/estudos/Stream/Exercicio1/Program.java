package estudos.Stream.Exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        String path= "C:\\Users\\Guilherme Porto\\Desktop\\Java_estudos\\intellij\\src\\estudos\\Stream\\Exercicio1\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> list=new ArrayList<>();
            String line=br.readLine();
            while(line!=null){
                String[] fields=line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line=br.readLine();
            }

            double avg=list.stream().map(p -> p.getPreco()).reduce(0.0,(a,b)-> a+b)/list.size();
            System.out.println("Average price: "+ avg);

            Comparator<String> comp=(s1, s2)-> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names=list.stream().filter(p->p.getPreco()<avg).map(p->p.getNome()).sorted(comp.reversed()).collect(Collectors.toList());
            names.forEach(System.out::println);


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
