package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer numero1 = input.nextInt();
        Integer contador=0;
        for(int i=1;i<=numero1;i++){

            if (numero1%i==0 || numero1%i==numero1){
                contador++;
            }

        }
        if(contador==2){
            System.out.println("O numero "+numero1+ " é um numero primo");
        }else {
            System.out.println("O numero "+numero1+ " nao é um numero primo");
        }
    }

}
