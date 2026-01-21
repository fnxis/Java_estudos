import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo usado para para escanear as mensagens usadas no console
        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);

        int y;
        y=sc.nextInt();
        System.out.println("Voce digitou: " + y);

        double z;
        z=sc.nextDouble();
        System.out.println("Voce digitou: " + z);

        char w;
        w=sc.next().charAt(0);
        System.out.println("Voce digitou: " + w);

        int h;
        String s1,s2,s3;

        sc.nextLine();  //Limpa o buffer do ENTER ao concluir uma entrada de dados
        h=sc.nextInt();
        sc.nextLine();  //Limpa o buffer do ENTER ao concluir uma entrada de dados
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(h);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();// fecha o metodo de escanear
    }
}
