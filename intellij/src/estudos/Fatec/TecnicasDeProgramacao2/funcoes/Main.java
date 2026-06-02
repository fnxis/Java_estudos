package estudos.Fatec.TecnicasDeProgramacao2.funcoes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        //System.out.println("Soma = "+m.somar(3,2));
        //System.out.println("Soma = "+somar2(3,2));
        // System.out.println("Soma = "+somaAnteriores(5));
        System.out.println("serie harmonica = "+ serieHarmonica(5));

    }
    public Integer somar(Integer a, Integer b){
        return a+b;
    }

    public static Integer somar2(Integer a, Integer b){
        return a+b;
    }

    public static Integer somaAnteriores(Integer a){
        Integer soma = 0;
        Integer primeiro=a;
        for(Integer i=0;a>i;a--){
            soma+=a;
            if(primeiro==a){
                soma-=a;
            }
        }
        return soma;
    }

    public static Double serieHarmonica(Integer a){
        Double soma=0D;
        for (Double i=1D;a>=i;a--){
            soma+=(double)1/a;
        }
        return soma;


    }


}
