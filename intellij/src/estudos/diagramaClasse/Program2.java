package estudos.diagramaClasse;

import estudos.diagramaClasse.entities2.Comment;
import estudos.diagramaClasse.entities2.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) throws ParseException {

        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("wow that's awesome");
        Comment comment3 = new Comment("Good night");

        Post p1=new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to new zeland","I'm going to visit this wonderful country!",12);
        p1.addComent(comment1);
        p1.addComent(comment2);

        System.out.println(p1.toString());

        Post p2=new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys","see you tomorow",100000);
        p2.addComent(comment1);
        p2.addComent(comment2);
        p2.addComent(comment3);

        System.out.println(p2.toString());

    }
}
