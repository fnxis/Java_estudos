package estudos.Fatec;

public class declaracao_array {
    public static void main(String[] args) {
        int [] a=new int[4];


        //declarando varios arrays
        int []r= new int[4], k=new int[4];

        //{}- Inicializar valores em um array na declaração
        int [] iniciaValores={12,32,54,6,8,89,64,6};

        //declara um array de inteiros
        int[] meuArray;
        //aloca memoria para 10 inteiros
        meuArray=new int[10];

        //inicializar valores
        meuArray[0]=10;
        meuArray[1]=100;
        meuArray[2]=200;
        meuArray[3]=300;
        meuArray[4]=400;
        meuArray[5]=500;
        meuArray[6]=600;
        meuArray[7]=700;
        meuArray[8]=800;
        meuArray[9]=900;

        System.out.println(meuArray[3]);

    }
}
