package exercicio_estrutura_repetitiva_while;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contA,contG,contD;
        int opcao=0;
        contA=0;
        contG=0;
        contD=0;
        while (opcao!=4){
            System.out.printf("Digite o combustivel usado%nAcool aperte 1%nGasolina aperte2%nDiesel aperte3%nPara sair digite 4%n");
            opcao = sc.nextInt();
            if(opcao==1){
                contA+=1;
            } else if (opcao==2) {
                contG+=1;
            }
            else if(opcao==3){
                contD+=1;
            } else if (opcao==4) {
                System.out.println("MUITO OBRIGADO");
            }



        }
        System.out.printf("Acool: %d%nGasolina: %d%nDiesel: %d",contA,contG,contD);
    }
}
