package estudos.trabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class Folders {
    public static void main(String[] args) {
        String strpath="C:\\Users\\Guilherme Porto\\Desktop";

        File path=new File(strpath);

        File[] folders=path.listFiles(File::isDirectory);
        for (File f: folders){
            System.out.println(f);
        }
        System.out.println("--------------------------------------");
        File[] files=path.listFiles(File::isFile);
        for (File f: files){
            System.out.println(f);
        }

        boolean sucess=new File(path+"\\subdir").mkdir();

        System.out.println("subdir: "+sucess);
    }
}
