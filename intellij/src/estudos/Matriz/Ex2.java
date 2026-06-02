package estudos.Matriz;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer denominador1= null;
        Integer denominador2= null;
        Integer numerador1= null;
        Integer numerador2= null;

        System.out.println("Digite o primeiro numerador: ");
        numerador1 = sc.nextInt();
        System.out.println("Digite o primeiro denominador: ");
        denominador1 = sc.nextInt();
        System.out.println("Digite o segundo numerador: ");
        numerador2 = sc.nextInt();
        System.out.println("Digite o segundo denominador: ");
        denominador2 = sc.nextInt();
        System.out.println("Digite a operacao (+,-,*,/)");
        String operacao = sc.next();

        Double resultado1= (double) (numerador1 / denominador1);
        Double resultado2= (double) (numerador2 / denominador2);

        Double resultado3;

        if (operacao.equals("+")) {
            resultado3= resultado1 + resultado2;
        }else if (operacao.equals("-")) {
            resultado3= resultado1 - resultado2;
        }else if (operacao.equals("*")) {
            resultado3= resultado1 * resultado2;
        }else if (operacao.equals("/")) {
            resultado3= resultado1 / resultado2;
        }else {
            resultado3= 0D;
        }

        System.out.println("Resultado da operação : "+resultado3);

    }
}
