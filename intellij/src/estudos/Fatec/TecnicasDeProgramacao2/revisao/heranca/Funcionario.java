package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public class Funcionario {

    private String nome;
    private String cargo;
    private Integer codigo;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String cargo, Integer codigo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.codigo = codigo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", codigo=" + codigo +
                ", salario=" + salario +
                '}';
    }
}
