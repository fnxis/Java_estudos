package estudos.set.Exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        String path= "C:\\Users\\Guilherme Porto\\Desktop\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();
            String linha = br.readLine();
            while (linha != null) {
                String[] linhaSplited = linha.split(" ");
                String nome = linhaSplited[0];
                Date data= Date.from(Instant.parse(linhaSplited[1]));
                set.add(new LogEntry(nome, data));
                linha = br.readLine();
            }
            System.out.println("Toal Users: "+ set.size());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());;
        }

    }


}
