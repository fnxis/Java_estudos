package estudos.exercicio_metodos_abstratos.entities;

public class PessoaJuridica extends Pessoa {

    private int numFuncionarios;
    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double imposto(){
        Double rendaImposto;
        if (numFuncionarios>10){
            rendaImposto=getRendaAnual()*0.14;
        }
        else {
            rendaImposto=getRendaAnual()*0.16;
        }

        return rendaImposto;
    }

}
