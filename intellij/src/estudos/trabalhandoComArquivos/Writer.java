package estudos.trabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        String[] line = new String[]{"TV LED,1290.99,1","Video game chair,350.50,3","Iphone X,900,2","Sansumg Galaxy 9,850,2"};

        String path = "C:\\Users\\Guilherme Porto\\Desktop\\file1.csv";

        try (BufferedWriter bf=new BufferedWriter(new FileWriter(path,true))){
            for (String s : line){
                bf.write(s);
                bf.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
