package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public abstract class Tributos {

    private static final Double VALOR_LIMITE=1000D;

    public abstract Double calcularTributos(Double valor,Double imposto);

    public Boolean ehElegivelTributar(Double valor){

        if (valor<VALOR_LIMITE){
            return false;
        }
        return true;
    }
}
