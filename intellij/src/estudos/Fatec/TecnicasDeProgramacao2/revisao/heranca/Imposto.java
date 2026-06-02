package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public abstract class Imposto extends Tributos{

    public Double calcularImposto(Double valor){
        if(valor<=1000){
            return valor*0.07;
        }
        else{
            return valor*0.11;
        }
    }


    public abstract Double aliquotaPadrao();

    public Double calcularTributos(Double valor,Double imposto){
        if(valor<=1000){
            return valor*0.07;
        }
        return valor*0.11;
    }

}
