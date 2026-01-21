package estudos.exercicio_metodos_abstratos.entities;

public class PessoaFisica extends Pessoa {

    private Double gastoSaude;

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }
    @Override
    public Double imposto() {
        double rendaImposto;
        if (getRendaAnual()<20000){
            rendaImposto=getRendaAnual()*0.15;
            if(getGastoSaude()>0){
                double gastoRenda=getGastoSaude()/2;
                rendaImposto=rendaImposto-gastoRenda;
            }
        }
        else{
            rendaImposto=getRendaAnual()*0.25;
            if(getGastoSaude()>0){
                double gastoRenda=getGastoSaude()/2;
                rendaImposto=rendaImposto-gastoRenda;
            }
        }

        return rendaImposto;
    }

}
