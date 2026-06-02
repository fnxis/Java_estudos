package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu ganho Bruto? ");
        Double salarioBruto = input.nextDouble();
        Integer aliquota = 0;
        Imprimir(salarioBruto,Aliquota(salarioBruto),Salario(salarioBruto,Deducao(salarioBruto),Aliquota(salarioBruto)));

    }

    public static Double Aliquota(Double salarioBruto){
        Double aliquota=0D;
        if (salarioBruto<=1212){
            aliquota=7.5;
        }else  if (salarioBruto<=2427.35){
            aliquota=9D;
        }else if(salarioBruto<=3641.03){
            aliquota=12D;
        }else if(salarioBruto<=7087.22){
            aliquota=14D;
        }
        return aliquota;
    }

    public static Double Deducao(Double salarioBruto){
        Double deducao=0D;
        if (salarioBruto<=1212){
            deducao=0D;
        }else  if (salarioBruto<=2427.35){
            deducao=18.18;
        }else if(salarioBruto<=3641.03){
            deducao=91D;
        }else if(salarioBruto<=7087.22){
            deducao=163.82;
        }
        return deducao;
    }

    public static Double Salario(Double salarioBruto,Double deducao,Double aliquota){
        Double valorDescontoInss=(salarioBruto*(aliquota/100))-deducao;
        return valorDescontoInss;
    }

    public static void Imprimir(Double salarioBruto,Double aliquota,Double valorDescontoInss){
        System.out.println("########################## \n" +
                "CALCULADORA DE INSS \n" +
                "########################## \n" +
                "Salário Bruto ....: "+salarioBruto+ "\n" +
                "Alíquota INSS (%).: "+aliquota +"\n" +
                "Desconto INSS ……..: "+valorDescontoInss+" \n" +
                "Salário Líquido ..: "+(salarioBruto-valorDescontoInss)+" \n" +
                "###########################");
    }


}
