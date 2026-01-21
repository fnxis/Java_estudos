package estudos.ListasArray;

import estudos.vetores.exercicios.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> lista = new ArrayList<>();

        System.out.println("Quantos funcionarios? ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Employee #"+i);
            System.out.print("Id: ");
            int id=sc.nextInt();
            System.out.print("Nome: ");
            String nome=sc.next();
            System.out.print("Salario: ");
            double salario=sc.nextDouble();

            Employee funcionario=new Employee(id,nome,salario);
            lista.add(funcionario);
        }
        System.out.print("Qual funcionario deseja aumentar o salario?");
        int idfunc=sc.nextInt();

        int pos=position(lista,idfunc);

        if (pos==-1){
            System.out.print("Esse ID nao existe");
        }else {
            System.out.print("Qual a porcentagem que deseja aumentar? ");
            double porcentagem=sc.nextDouble();
            lista.get(pos).increaseSalario(porcentagem);
        }

        System.out.println("Lista dos funcionarios");

        for (int j=0;j<lista.size();j++){
            System.out.println(lista.get(j).toString());
        }
    }
    static int position(List<Employee> lista,int id){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getId()==id){
                return i;
            };
        }
        return -1;
    }

}
