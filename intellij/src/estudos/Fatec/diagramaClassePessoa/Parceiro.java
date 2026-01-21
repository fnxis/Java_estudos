package estudos.Fatec.diagramaClassePessoa;

public class Parceiro extends Juridica {
    private String tipoPessoa;
    private Float desempenho;


    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Float getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(Float desempenho) {
        this.desempenho = desempenho;
    }

    public void cadastrar(){
        System.out.println("Cadastro de parceiro com sucesso");
    }

    public void bloquear(){
        System.out.println("Bloqueando parceiro com sucesso");
    }

    public void excluir(){
        System.out.println("Excluindo parceiro com sucesso");
    }

}
