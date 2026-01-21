package exercicio_estruturas_condicionais;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String valor;
        numero=input.nextInt();
        valor ="";
        if (numero>0 && numero<=25){
            valor="[0,25]";
        }
        else if (numero>25 && numero<=50){
            valor="[25,50]";
        }
        else if (numero>50 && numero<=75){
            valor="[50,75]";
        }
        else if (numero>75 && numero<=100){
            valor="[75,100]";
        }
        System.out.printf("Intervalo %s",valor);
    }
}
