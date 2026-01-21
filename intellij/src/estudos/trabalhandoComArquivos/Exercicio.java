package estudos.trabalhandoComArquivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = "C:\\Users\\Guilherme Porto\\Desktop\\file1.csv";

        List<Valores> list = new ArrayList<>();

        System.out.println("Digite o caminho do arquivo:");
        String srcFileStr = input.nextLine();

        File srcFile =new File(srcFileStr);

        String srcFolderParent=srcFile.getParent();
        System.out.println(srcFolderParent);

        boolean sucess=new File(srcFolderParent+"\\out").mkdir();
        System.out.println("Folder Created: "+sucess);

        String summarycsv= srcFolderParent+"\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(srcFile))){
            String itemCsv=br.readLine();
            while(itemCsv!=null){
                String[] fields=itemCsv.split(",");
                String name=fields[0];
                double value=Double.parseDouble(fields[1]);
                int quantidade=Integer.parseInt(fields[2]);
                list.add(new Valores(name,value,quantidade));
                itemCsv=br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(summarycsv))){

                for(Valores item:list){
                    bw.write(item.toString());
                }

            }catch(IOException e){
                e.printStackTrace();
            }

        }catch (IOException e ){
            System.out.println("ERROR: "+e.getMessage());
        }


    }
}
