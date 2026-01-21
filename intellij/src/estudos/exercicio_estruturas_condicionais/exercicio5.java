package exercicio_estruturas_condicionais;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;
        double codigo;
        double conta;
        System.out.println("Digite o quantidade de produtos: ");
        quantidade=input.nextInt();
        codigo=input.nextInt();


        if (codigo==1){
            conta=quantidade*4;
        }
        else if (codigo==2){
            conta=quantidade*4.5;
        }
        else if (codigo==3){
            conta=quantidade*5;
        }
        else if (codigo==4){
            conta=quantidade*2;
        }
        else if (codigo==5){
            conta=quantidade*1;
        }
        else{
            conta=0;
        }


        System.out.printf("total: %.2f", conta);
    }
}
