package estudos.Fatec.diagramaProva;

import java.util.Date;

public class Matricula  {

    private Aluno aluno;
    private Turma turma;
    private Date dataMatricula;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.dataMatricula=new Date();
    }
}
