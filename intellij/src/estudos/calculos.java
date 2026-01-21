package estudos;

public class calculos {
    public static void main(String[] args) {
        double x=3.0;
        double y=4.0;
        double z=-5.0;
        double A,B,C;

        A=Math.sqrt(x); //calcula a raiz quadrada do parametro
        B=Math.sqrt(y); //calcula a raiz quadrada do parametro
        C=Math.sqrt(25.0); //calcula a raiz quadrada do parametro
        System.out.println("Raiz quadrada de "+x+ " = "+A);
        System.out.println("Raiz quadrada de "+y+ " = "+B);
        System.out.println("Raiz quadrada de 25 = "+C);

        A=Math.pow(x,y);  //calcula a elevação do primeiro parametro em relação ao segundo
        B=Math.pow(x,2.0);  //calcula a elevação do primeiro parametro em relação ao segundo
        C=Math.pow(5.0,2.0);  //calcula a elevação do primeiro parametro em relação ao segundo
        System.out.println(x+" elevado a "+y+" = "+A);
        System.out.println(x+" elevado ao quadrado = "+B);
        System.out.println("5 elevado ao quadrado = "+C);

        A=Math.abs(y);  //verifica o valor absoluto do parametro
        B=Math.abs(z);  //verifica o valor absoluto do parametro
        System.out.println("Valor absoluto de "+y+" = "+A);
        System.out.println("Valor absoluto de "+z+" = "+B);







    }
}
