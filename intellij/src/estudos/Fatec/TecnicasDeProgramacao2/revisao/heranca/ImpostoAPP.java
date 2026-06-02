package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public class ImpostoAPP {
    public static void main(String[] args) {
        Imposto imposto = new  ImpostoPadrao();

        System.out.println(imposto.calcularImposto(500D));
        System.out.println(imposto.calcularImposto(2500D));

        imposto=new ImpostoMG();
        System.out.println(imposto.calcularImposto(500D));
        System.out.println(imposto.calcularImposto(2500D));

        imposto=new ImpostoRJ();

        System.out.println(imposto.calcularImposto(500D));
        System.out.println(imposto.calcularImposto(2500D));

        Tributos t = new ImpostoMG();

        System.out.println("t é um imposto?");
        System.out.println(t instanceof  Imposto);

        if(t instanceof  ImpostoMG){
            Imposto i = (Imposto) t;
        }



    }
}
