package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex06Funcionario {

    private String nome;
    private String matricula;
    private double salario;
    private String dataAdmissao;
    private String cpf;

    public Ex06Funcionario(String nome, String matricula, double salario, String dataAdmissao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    public double calcularGanhoBrutoAnual() {
        return this.salario * 12;
    }

    public double calcularGanhoLiquidoMensal() {
        double inss = this.salario * 0.11;
        double ir = 0;

        if (this.salario > 2500.00) {
            ir = (this.salario - 2500.00) * 0.175;
        }

        return this.salario - inss - ir;
    }

    public double calcularImposto() {
        double inssMensal = this.salario * 0.11;
        double irMensal = 0;

        if (this.salario > 2500.00) {
            irMensal = (this.salario - 2500.00) * 0.175;
        }

        return (inssMensal + irMensal) * 12;
    }

    public double calcularGanhoLiquidoAnual() {
        return calcularGanhoLiquidoMensal() * 12;
    }

    public double getSalario() { return salario; }
    public String getNome() { return nome; }

}
