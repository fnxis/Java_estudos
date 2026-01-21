package exercicio_estruturas_condicionais;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comeco,termino;
        System.out.println("DIgite o horario de inicio");
        comeco=input.nextInt();
        System.out.println("DIgite o horario de termino");
        termino=input.nextInt();
        int duracao;
        if(comeco==termino){
            duracao=24;
        }
        else {
            duracao=termino-comeco;
        }
        if(comeco>termino){
            duracao=24-comeco+termino;
        }

        System.out.printf("O JOGO DUROU %d HORAS",duracao);
    }
}
