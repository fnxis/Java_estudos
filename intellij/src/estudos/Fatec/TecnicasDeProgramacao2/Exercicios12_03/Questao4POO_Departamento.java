package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao4POO_Departamento {

    private String codigo;
    private String nome;
    private String areaConhecimento;

    public Questao4POO_Departamento(String codigo, String nome, String areaConhecimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.areaConhecimento = areaConhecimento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Nome: " + nome +
                ", Área: " + areaConhecimento;
    }

}
