package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public class FuncionarioHorista extends Funcionario {

    private Double valorHora;
    private Integer horas;


    public FuncionarioHorista(String nome, String cargo, Integer codigo,Double valorHora, Integer horas) {
        super(nome, cargo, codigo, valorHora*horas);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "Nome="+super.getNome()+
                ", Cargo="+super.getCargo()+
                ", Codigo="+super.getCodigo()+
                ",valorHora=" + valorHora +
                ", horas=" + horas +
                ", salario=" + super.getSalario() +
                '}';
    }
}
