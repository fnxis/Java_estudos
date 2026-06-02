package estudos.Matriz;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual o primeiro tamanho da matriz1: ");
        int primeiroTamanho = sc.nextInt();
        System.out.println("Digite qual o segundo tamanho da matriz1: ");
        int segundoTamanho = sc.nextInt();

        System.out.println("Digite qual o primeiro tamanho da matriz2: ");
        int primeiroTamanho2 = sc.nextInt();
        System.out.println("Digite qual o segundo tamanho da matriz2: ");
        int segundoTamanho2 = sc.nextInt();

        int[][]matriz1 = new int[primeiroTamanho][segundoTamanho];
        int[][]matriz2 = new int[primeiroTamanho2][segundoTamanho2];

        inserirMatriz(matriz1,sc);
        Imprimir(matriz1);

        inserirMatriz(matriz2,sc);
        Imprimir(matriz2);

        Imprimir(MultiplicarMatriz(matriz1,matriz2));

    }

    public static void inserirMatriz(int[][] matriz, Scanner sc){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("Digite o valor da matriz 2x2: ");
                matriz[i][j]=sc.nextInt();
            }
        }
    }

    public static int[][] MultiplicarMatriz(int[][] matriz1, int[][] matriz2){
        int coluna=matriz1.length;
        int linha=matriz2[0].length;
        int comum=matriz1[0].length;
        if (comum!=matriz2.length){
            return null;
        }
        int[][] matriz= new int[coluna][linha];

        for(int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                for(int k=0;k<comum;k++){
                    matriz[i][j]+=matriz1[i][k]*matriz2[k][j];
                }
            }
        }
        return matriz;
    }


    public static void Imprimir(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
