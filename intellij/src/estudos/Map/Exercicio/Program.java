package estudos.Map.Exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path= "C:\\Users\\Guilherme Porto\\Desktop\\in.txt";
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha=br.readLine();
            while (linha != null) {

                String[] lineSplited = linha.split(",");
                String nome = lineSplited[0];
                int votos=Integer.parseInt(lineSplited[1]);
                //quando ja existir aquela chave 'nome do candidato', ira pegar o valor que ele tinha e atualizar adicionando ao valor novo
                if (map.containsKey(nome)){
                    int votosMais=map.get(nome);
                    map.put(nome,votosMais+votos);
                }else {
                    map.put(nome,votos);
                }
                linha=br.readLine();
            }
            for (String key:map.keySet()) {
                System.out.println(key+": "+map.get(key));
            }
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }

    }


}
