package estudos.Matriz;

public class Exercicio6 {

    public static void main(String[] args) {

        double[][]MatrizConsumiveis=new double[1][3];
        MatrizConsumiveis[0][0]=6.5;
        MatrizConsumiveis[0][1]=8;
        MatrizConsumiveis[0][2]=4.5;

        double[][] consumo=new double[3][5];
        consumo[0][0]=2;
        consumo[0][1]=1;
        consumo[0][2]=2;
        consumo[0][3]=2;
        consumo[0][4]=0;
        consumo[1][0]=0;
        consumo[1][1]=4;
        consumo[1][2]=5;
        consumo[1][3]=2;
        consumo[1][4]=1;
        consumo[2][0]=2;
        consumo[2][1]=1;
        consumo[2][2]=2;
        consumo[2][3]=0;
        consumo[2][4]=2;

        double[]totalPessoa=new double[5];

        for (int i=0;i<totalPessoa.length;i++){
            for (int j=0;j<MatrizConsumiveis[0].length;j++){
                totalPessoa[i]+=MatrizConsumiveis[0][j]*consumo[j][i];
            }
        }

        for (int i=0;i<totalPessoa.length;i++){
                System.out.println(totalPessoa[i]);
        }

    }

}
