package estudos.Stream.Exercicio2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path="C:\\Users\\Guilherme Porto\\Desktop\\Java_estudos\\intellij\\src\\estudos\\Stream\\Exercicio2\\in.txt";

        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            List<Datas> list= new ArrayList<Datas>();
            String line=br.readLine();
            while(line!=null){
                String[] fields=line.split(",");
                list.add(new Datas(fields[0],Double.parseDouble(fields[1]),fields[2]));
                line=br.readLine();
            }
            System.out.println("Valor do salario: ");
            double salario=sc.nextDouble();

            Comparator<String> comparator= (email1,email2)-> email1.toUpperCase().compareTo(email2.toUpperCase());

            List<String> emails=list.stream().filter(s-> s.getSalario() > salario).map(p->p.getEmail()).sorted(comparator).collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum =list.stream().filter(x -> x.getNome().charAt(0) == 'M').map(n->n.getSalario()).reduce(0.0,(x,y)->x+y);

            System.out.println(sum);



        }catch (IOException e){
            System.out.println(e.getMessage());
        }




    }
}
