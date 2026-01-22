package estudos.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();/*Mantem a ordem q foi inserido os dados*/
        Set<String> set1 = new HashSet<>();/*metodo mais rapido mas nao mantem a ordem*/
        Set<String> set2 = new LinkedHashSet<>();/*metodo mais devagar mas mantem a ordem*/
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("TV"));
        System.out.println(set.add("Notebook2"));
        set.remove("Tablet");
        /* set.removeIf(x -> x.length()>3);*//* Remove todas Strings maiores que 3 caracteres*/
        set.removeIf(x->x.charAt(0)=='T');

        for(String s : set){
            System.out.println(s);
        }

    }
}
