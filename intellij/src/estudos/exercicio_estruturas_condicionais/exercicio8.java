package exercicio_estruturas_condicionais;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario,imposto;
        salario=input.nextDouble();
        imposto=0.00;
        if(salario<=2000){
            imposto=0;
        } else if (salario>2000 && salario<=3000) {
            imposto=(salario-2000)*0.08;
        } else if (salario>3000 && salario<=4500) {
            imposto=(salario-3000)*0.18+1000*0.08;
        }
        else{
            imposto=(salario-4500)*0.28+1500*0.18+1000*0.08;
        }

        if (imposto==0){
            System.out.print("Isento");
        }
        else{
            System.out.printf("%.2f",imposto);
        }
    }
}
