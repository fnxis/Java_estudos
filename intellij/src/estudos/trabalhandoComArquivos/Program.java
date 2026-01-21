package estudos.trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Guilherme Porto\\Downloads\\texto.txt");

        Scanner scanner=null;

        try {
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }
        finally{
            if(scanner!=null){
                scanner.close();
            }
        }

    }
}
