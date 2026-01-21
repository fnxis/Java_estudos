package exercicio_estrutura_repetitiva_while;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        senha = 2;

        while(senha!=2002){
            senha = sc.nextInt();

            if(senha!=2002){
                System.out.println("Acesso negado");
            }
        }
        System.out.println("Acesso permitido");
    }
}
