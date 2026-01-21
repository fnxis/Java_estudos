package exercicios_basicos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario;
        double horas,salario;

        System.out.println("Digite o numero de funcionario: ");
        numFuncionario=sc.nextInt();
        System.out.println("Digite quantas horas o funcionario trabalha: ");
        horas=sc.nextDouble();
        System.out.println("Digite o valo por hora que o funcionario ganha: ");
        salario=sc.nextDouble();

        System.out.println("Number = "+numFuncionario);
        System.out.println("Salary = u$ "+salario*horas);

    }
}
