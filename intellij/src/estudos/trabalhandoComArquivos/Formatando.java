package estudos.trabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class Formatando {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String strPath=input.nextLine();

        File file = new File(strPath);

        System.out.println("GetPath: "+file.getPath());
        System.out.println("getName: "+file.getName());
        System.out.println("getLastModified: "+file.lastModified());
        System.out.println("getSize: "+file.length());
        System.out.println("getParent: "+file.getParent());


    }
}
