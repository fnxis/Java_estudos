package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public class ImpostoRJ extends Imposto {

    @Override
    public Double calcularImposto(Double valor) {
        Double imposto=super.calcularImposto(valor);
        Double adicional;
        if(imposto<=100){
            adicional=valor*0.03;
        }else if(imposto<=1000){
            adicional=valor*0.4;
        }else{
            adicional=valor*0.5;
        }
        return imposto+adicional;
    }

    @Override
    public Double aliquotaPadrao() {
        return 0.0;
    }
}
