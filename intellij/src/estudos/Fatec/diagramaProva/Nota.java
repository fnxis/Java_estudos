package estudos.Fatec.diagramaProva;

public class Nota {

    private Aluno aluno;
    private Disciplina disciplina;
    private Double valor;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Nota(Aluno aluno, Disciplina disciplina, Double valor) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.valor = valor;
    }
}
