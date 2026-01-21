package estudos.Fatec.diagramaProva;

public class Frequencia {

    private Aluno aluno;
    private Disciplina disciplina;
    private Boolean presente;

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

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

    public Frequencia(Aluno aluno, Disciplina disciplina, Boolean presente) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.presente = presente;
    }



}
