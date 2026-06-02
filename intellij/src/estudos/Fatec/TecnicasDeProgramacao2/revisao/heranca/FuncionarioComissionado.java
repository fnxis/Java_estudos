package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public class FuncionarioComissionado extends Funcionario {

    private Integer comissao;

    public FuncionarioComissionado(String nome, String cargo, Integer codigo, Double salario, Integer comissao) {
        super(nome, cargo, codigo, salario);
        this.comissao = comissao;
    }

    public Integer getComissao() {
        return comissao;
    }

    public void setComissao(Integer comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "FuncionarioComissionado{" +
                "Nome="+super.getNome()+", Cargo="+super.getCargo()+", Codigo="+super.getCodigo()+
                ",salario=" + super.getSalario() +
                ", comissao=" + comissao +"%"+
                '}';
    }
}
