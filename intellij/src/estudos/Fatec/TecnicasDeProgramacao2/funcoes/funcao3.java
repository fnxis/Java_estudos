package estudos.Fatec.TecnicasDeProgramacao2.funcoes;

import java.awt.*;
import java.util.Random;

public class funcao3 {
    public static void main(String[] args) {
        Random random = new Random();

        int ListA[]=new int[20];
        int ListB[]=new int[20];

        Preencher(random,ListA);
        Preencher(random,ListB);

        Imprimir(ListA);
        Imprimir(ListB);

        int somaArray[]=Soma(ListA,ListB);

        Imprimir(somaArray);

        int antecessor=Antecessores(5);
        System.out.println("Antecessores: "+antecessor);

        int listaSomaAnterior[]=AntecessoresLista(ListA);
        Imprimir(listaSomaAnterior);

        Pagamento listaPagamento[]=valorTotalParcelas(1000D,5,5D);
        for (Pagamento p: listaPagamento){
            System.out.println(p);
        }

    }

    public static void Preencher(Random random, int[] lista){
        for (int i=0;i<lista.length;i++){
            lista[i]=random.nextInt(20);
        }
    }

    public static int[] Soma(int[] lista1, int[] lista2){
        int soma[]=new int[lista2.length];
        for (int i=0;i<lista1.length;i++){
            soma[i]=lista1[i]+lista2[i];
        }
        return soma;
    }

    public static int Antecessores(int valor){
        int soma=0;
        for (int i=0;valor>i;valor--){
            soma+=valor;
        }
        return soma;
    }

    public static int[] AntecessoresLista(int[] lista){
        int listaAntecessor[]= new int[lista.length];
        for (int i=0;i<lista.length;i++){
            int valor=lista[i];
            for (int j=0;valor>j;valor--){
                listaAntecessor[i]+=valor;
            }
        }

        return listaAntecessor;
    }

    public static void Imprimir(int[] lista){
        for (int i=0;i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println(" ");
    }

    public static Pagamento[] valorTotalParcelas(Double valor,int parcelas,Double taxa){
        Double parcelaFixa=valor/parcelas;
        Double saldoDevedor=valor;

        Pagamento listaPagamento[]=new Pagamento[parcelas];

            for (int i=0;i<parcelas;i++){

                Double juros=saldoDevedor*taxa/100;
                Double valorParcela=parcelaFixa+juros;

                Pagamento pagamento=new Pagamento();
                pagamento.setParcela(i);
                pagamento.setAmortizacao(parcelaFixa);
                pagamento.setSaldoDevedor(saldoDevedor);
                pagamento.setValorParcela(valorParcela);
                pagamento.setValorJuros(juros);


                listaPagamento[i]=pagamento;
                saldoDevedor-=parcelaFixa;
            }
                return listaPagamento;
            }
}
