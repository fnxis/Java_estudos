package estudos.Fatec.TecnicasDeProgramacao2.funcoes;

import java.util.Random;

public class funcao2 {
    public static void main(String[] args) {
        Random random = new Random();

        int lista[]=new int[10];
        for (int i=0;i<lista.length;i++){
            lista[i]= random.nextInt(1000);
            System.out.println(lista[i]);
        }
        double soma=0;
        for (int i=0;i<lista.length;i++){
            soma+=lista[i];
        }
        System.out.println("Soma: "+soma);
        int quantidade=0;
        for(int j=0;j<10;j++){
            if(lista[j]%3==0){
                quantidade++;
            }
        }
        System.out.println("Quantidade de multiplos de 3: "+quantidade);

    }






}
